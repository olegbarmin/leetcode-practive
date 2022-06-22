package com.barmin.two.pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContainerWithMostWaterTest {

    @Test
    void test1() {
        final int[] input = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        final int expected = 49;

        Assertions.assertEquals(expected, ContainerWithMostWater.maxArea(input));
    }

    @Test
    void test2() {
        final int[] input = {1, 1};
        final int expected = 1;

        Assertions.assertEquals(expected, ContainerWithMostWater.maxArea(input));
    }
}