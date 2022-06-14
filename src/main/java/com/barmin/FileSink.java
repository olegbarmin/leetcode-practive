package com.barmin;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

import static java.nio.file.StandardOpenOption.APPEND;

public class FileSink {

    private final Queue<String> queue = new ConcurrentLinkedQueue<>();
    private final LogContainer logContainer = new LogContainer();
    private final Path logsFile;

    FileSink(final Path logsFile) {
        this.logsFile = logsFile;
    }

    void write(final String logMessage) {
        System.out.println("writing: " + logMessage);
        queue.add(logMessage);
        this.logContainer.semaphore.release();
    }

    void flush() throws InterruptedException {
        this.logContainer.isRunning = false;
        this.logContainer.stopLatch.await();
    }

    private class LogContainer {
        private final Semaphore semaphore = new Semaphore(0);
        private final CountDownLatch stopLatch = new CountDownLatch(1);
        private boolean isRunning = true;

        private LogContainer() {
            Thread writerThread = new Thread(this::doWriting);
            writerThread.start();
        }

        private void doWriting() {
            try {
                while (isRunning || !queue.isEmpty()) {
                    semaphore.acquire();
                    String log = queue.poll();
                    if (log == null) throw new IllegalStateException();

                    Files.writeString(logsFile, log + System.lineSeparator(), APPEND);
                }
                stopLatch.countDown();
            } catch (InterruptedException | IOException e) {
                e.printStackTrace();
            }
        }
    }
}