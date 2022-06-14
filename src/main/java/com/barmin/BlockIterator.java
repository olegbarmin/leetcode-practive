package com.barmin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class BlockIterator implements Iterator<List<String>> {

    private enum BLOCK_STATE {
        FOUND, NO_FOUND
    }

    private final Iterator<String> content;
    private final String start;
    private final String end;

    private BLOCK_STATE state = BLOCK_STATE.NO_FOUND;

    public BlockIterator(Iterator<String> arguments, String start, String end) {
        this.content = arguments;
        this.start = start;
        this.end = end;
    }

    @Override
    public boolean hasNext() {
        return (state == BLOCK_STATE.FOUND  && content.hasNext()) || seekStart();
    }

    @Override
    public List<String> next() {
        final List<String> next = new ArrayList<>();

        while (hasNext()) {
            final String v = content.next();
            if (v.equals(end) && state == BLOCK_STATE.FOUND) {
                state = BLOCK_STATE.NO_FOUND;
                break;
            }
            next.add(v);
        }

        if (next.isEmpty()) {
            throw new NoSuchElementException();
        }

        return next;
    }

    private boolean seekStart() {
        while (content.hasNext()) {
            if (content.next().equals(start)) {
                this.state = BLOCK_STATE.FOUND;
                return true;
            }
        }
        return false;
    }
}
