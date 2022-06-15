package com.barmin.two.pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TrappingRainWaterTest {

    @Test
    void test1() {
        int[] input = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int expected = 6;

        Assertions.assertEquals(expected, TrappingRainWater.trap(input));
    }

    @Test
    void test2() {
        int[] input = {4,2,3};
        int expected = 1;

        Assertions.assertEquals(expected, TrappingRainWater.trap(input));
    }
}