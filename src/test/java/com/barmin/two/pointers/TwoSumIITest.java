package com.barmin.two.pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumIITest {

    @Test
    void test1() {
        int[] input = {2, 7, 11, 15};
        int target = 9;

        int[] expected = {1, 2};
        Assertions.assertArrayEquals(expected, TwoSumII.twoSum(input, target));
    }
}