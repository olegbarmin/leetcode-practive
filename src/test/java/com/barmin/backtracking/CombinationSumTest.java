package com.barmin.backtracking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class CombinationSumTest {

    @Test
    void test1() {
        final var input = new int[]{2, 3, 6, 7};
        final var target = 7;
        final var result = CombinationSum.combinationSum(input, target);

        final var expected = Set.of(List.of(2, 2, 3), List.of(7));
        final var actual = new HashSet<>(result);
        Assertions.assertEquals(expected, actual);
    }
}