package com.barmin.binary.search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchTest {


    @Test
    void test1() {
        final var input = new int[]{-1, 0, 3, 5, 9, 12};
        Assertions.assertEquals(4, BinarySearch.search(input, 9));
    }

    @Test
    void test2() {
        final var input = new int[]{-1, 0, 3, 5, 9, 12};
        Assertions.assertEquals(-1, BinarySearch.search(input, 2));
    }

    @Test
    void test3() {
        final var input = new int[]{-1, 0, 5};
        Assertions.assertEquals(2, BinarySearch.search(input, 5));
    }
}