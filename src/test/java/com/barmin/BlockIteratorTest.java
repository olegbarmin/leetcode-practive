package com.barmin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.NoSuchElementException;

class BlockIteratorTest {

    @Test
    void testHasNextReturnsBlock() {
        final var arguments = List.of(
                "zero",
                "Start",
                "one",
                "two",
                "End",
                "no",
                "not",
                "Start",
                "three",
                "four",
                "End",
                "Five",
                "Start",
                "six"
        );
        final var iterator = new BlockIterator(arguments.iterator(), "Start", "End");
        Assertions.assertTrue(iterator.hasNext());
//        Assertions.assertEquals(List.of("one", "two"), iterator.next());

        Assertions.assertTrue(iterator.hasNext());
//        Assertions.assertEquals(List.of("three", "four"), iterator.next());

        Assertions.assertTrue(iterator.hasNext());
//        Assertions.assertEquals(List.of("six"), iterator.next());

//        Assertions.assertFalse(iterator.hasNext());
//        Assertions.assertThrows(NoSuchElementException.class, iterator::next);
    }
}