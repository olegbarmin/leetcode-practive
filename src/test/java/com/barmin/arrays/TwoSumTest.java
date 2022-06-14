package com.barmin.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumTest {

    @Test
    void test1() {
        final var nums = new int[]{2, 7, 11, 15};
        final var t = 9;

        final var expected = new int[]{0, 1};
        int[] actual = TwoSum.twoSum(nums, t);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void test2() {
        final var nums = new int[]{3, 2, 4};
        final var t = 6;

        final var expected = new int[]{1, 2};
        int[] actual = TwoSum.twoSum(nums, t);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void test3() {
        final var nums = new int[]{3, 3};
        final var t = 6;

        final var expected = new int[]{0, 1};
        int[] actual = TwoSum.twoSum(nums, t);
        Assertions.assertArrayEquals(expected, actual);
    }
}