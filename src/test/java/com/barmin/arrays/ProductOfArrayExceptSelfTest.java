package com.barmin.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductOfArrayExceptSelfTest {

    @Test
    void test1() {
        final int[] input = {1, 2, 3, 4};

        final int[] expected = {24, 12, 8, 6};
        Assertions.assertArrayEquals(expected, ProductOfArrayExceptSelf.productExceptSelf(input));
    }
}