package com.barmin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class FileSinkTest {

    @TempDir
    private static Path directory;
    private Path logFile;
    private FileSink fileSink;

    @BeforeEach
    void createLogFile() throws IOException {
        logFile = Paths.get(directory.toString(), "/log-%s.log".formatted(UUID.randomUUID().toString()));
        Files.createFile(logFile);
        fileSink = new FileSink(logFile);
    }

    @Test
    void writeOneLine() throws IOException, InterruptedException {
        final String logMessage = "My Log";
        fileSink.write(logMessage);
        fileSink.flush();

        List<String> logs = Files.readAllLines(logFile);

        Assertions.assertEquals(1, logs.size());
        String actual = logs.iterator().next();
        Assertions.assertEquals(logMessage, actual);
    }

    @Test
    void writeLinesMultiThread() throws IOException, InterruptedException, ExecutionException {
        int parallelism = Runtime.getRuntime().availableProcessors();
        final var executorService = Executors.newFixedThreadPool(parallelism);
        final int logsPerThread = 1000;

        List<Callable<Void>> callables = IntStream.range(1, parallelism + 1)
                .mapToObj(id -> new LogWriter(id, logsPerThread, fileSink))
                .collect(Collectors.toList());

        List<Future<Void>> futures = executorService.invokeAll(callables);
        for (Future<Void> future : futures) {
            future.get();
        }
        fileSink.flush();

        List<String> lines = Files.readAllLines(logFile);
        Assertions.assertEquals(parallelism * logsPerThread, lines.size());
    }

    private static class LogWriter implements Callable<Void> {

        private final int threadId;
        private final int logsNumber;
        private final FileSink fileSink;

        private LogWriter(int threadId, int logsNumber, FileSink fileSink) {
            this.threadId = threadId;
            this.logsNumber = logsNumber;
            this.fileSink = fileSink;
        }

        @Override
        public Void call() {
            for (int i = 0; i < logsNumber; i++) {
                fileSink.write("Thread %s - Log #%s".formatted(threadId, i));
            }
            return null;
        }
    }
}