package com.barmin.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TopKFrequentElementsTest {

    @Test
    void test1() {
        int[] input = {1, 1, 1, 2, 2, 3};
        var k = 2;

        int[] expected = {1, 2};
        Assertions.assertArrayEquals(expected, TopKFrequentElements.topKFrequent(input, k));
    }

    @Test
    void test2() {
        int[] input = {1};
        var k = 1;

        int[] expected = {1};
        Assertions.assertArrayEquals(expected, TopKFrequentElements.topKFrequent(input, k));
    }

    @Test
    void test3() {
        int[] input = {1,2};
        var k = 2;

        int[] expected = {1, 2};
        Assertions.assertArrayEquals(expected, TopKFrequentElements.topKFrequent(input, k));
    }

}