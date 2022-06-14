package com.barmin.dynamic.programming.one.d;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinCostClimbingStairsTest {

    @Test
    void test1() {
        int[] input = {10, 15, 20};
        int actual = MinCostClimbingStairs.minCostClimbingStairs(input);
        int expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test2() {
        int[] input = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int actual = MinCostClimbingStairs.minCostClimbingStairs(input);
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test3() {
        int[] input = {0, 2, 2, 1};
        int actual = MinCostClimbingStairs.minCostClimbingStairs(input);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }
}