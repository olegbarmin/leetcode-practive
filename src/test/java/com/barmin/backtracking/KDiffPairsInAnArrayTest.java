package com.barmin.backtracking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KDiffPairsInAnArrayTest {

    @Test
    void test1() {
        int[] input = {3, 1, 4, 1, 5};
        int k = 2;

        Assertions.assertEquals(2, KDiffPairsInAnArray.findPairs(input, k));
    }

    @Test
    void test2() {
        int[] input = {1, 2, 3, 4, 5};
        int k = 1;

        Assertions.assertEquals(4, KDiffPairsInAnArray.findPairs(input, k));
    }

    @Test
    void test3() {
        int[] input = {1, 3, 1, 5, 4};
        int k = 0;

        Assertions.assertEquals(1, KDiffPairsInAnArray.findPairs(input, k));
    }

    @Test
    void test4() {
        int[] input = {1, 1, 1, 1};
        int k = 0;

        Assertions.assertEquals(1, KDiffPairsInAnArray.findPairs(input, k));
    }
}