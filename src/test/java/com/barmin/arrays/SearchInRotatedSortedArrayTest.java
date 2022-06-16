package com.barmin.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class SearchInRotatedSortedArrayTest {

    @Test
    void test1() {
        final int[] input = {4, 5, 6, 7, 0, 1, 2};
        final var target = 0;

        Assertions.assertEquals(4, SearchInRotatedSortedArray.search(input, target));
    }

    @Test
    void test2() {
        final int[] input = {3, 1};
        final var target = 1;

        Assertions.assertEquals(1, SearchInRotatedSortedArray.search(input, target));
    }

    @Test
    void test3() {
        final int[] input = {4, 5, 6, 7, 0, 1, 2};
        final var target = 5;

        Assertions.assertEquals(1, SearchInRotatedSortedArray.search(input, target));
    }

    @Test
    void test4() {
        final int[] input = {1, 3};
        final var target = 3;

        Assertions.assertEquals(1, SearchInRotatedSortedArray.search(input, target));
    }
}