package com.barmin.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximumSubarrayTest {

    @Test
    void test() {
        final int[] input = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        final var expected = 6;

        Assertions.assertEquals(expected, MaximumSubarray.maxSubArray(input));
    }

    @Test
    void test1() {
        final int[] input = {-2, -1};
        final var expected = -1;

        Assertions.assertEquals(expected, MaximumSubarray.maxSubArray(input));
    }

    @Test
    void test2() {
        final int[] input = {-1, 0};
        final var expected = 0;

        Assertions.assertEquals(expected, MaximumSubarray.maxSubArray(input));
    }

}