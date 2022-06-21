package com.barmin.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestConsecutiveSequenceTest {

    @Test
    void test1() {
        final int[] input = {100, 4, 200, 1, 3, 2};

        Assertions.assertEquals(4, LongestConsecutiveSequence.longestConsecutive(input));
    }

    @Test
    void test2() {
        final int[] input = {0, -1};

        Assertions.assertEquals(2, LongestConsecutiveSequence.longestConsecutive(input));
    }

    @Test
    void test3() {
        final int[] input = {4, 0, -4, -2, 2, 5, 2, 0, -8, -8, -8, -8, -1, 7, 4, 5, 5, -4, 6, 6, -3};

        Assertions.assertEquals(5, LongestConsecutiveSequence.longestConsecutive(input));
    }
}