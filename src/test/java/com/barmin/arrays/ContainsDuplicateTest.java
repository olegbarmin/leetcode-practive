package com.barmin.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContainsDuplicateTest {

    @Test
    void test1() {
        final int[] nums = {1, 2, 3, 1};
        final boolean expected = true;

        Assertions.assertEquals(expected, ContainsDuplicate.containsDuplicate(nums));
    }
}