package com.barmin.two.pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ThreeSumTest {

    @Test
    void test1() {
        final int[] nums = {-1, 0, 1, 2, -1, -4};
        final var expected = Set.of(List.of(-1, -1, 2), List.of(-1, 0, 1));

        final var actual = new HashSet<>(ThreeSum.threeSum(nums));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test2() {
        final int[] nums = {0, 0, 0, 0};
        final var expected = Set.of(List.of(0, 0, 0));

        final var actual = new HashSet<>(ThreeSum.threeSum(nums));

        Assertions.assertEquals(expected, actual);
    }
}