package com.barmin.backtracking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class SubsetsTest {

    @Test
    void test1() {
        final var input = new int[]{1, 2, 3};
        final var result = Subsets.subsets(input);

        final var expected = Set.of(List.of(), List.of(1), List.of(2),
                List.of(1, 2), List.of(3), List.of(1, 3), List.of(2, 3), List.of(1, 2, 3));
        final var actual = new HashSet<>(result);
        Assertions.assertEquals(expected, actual);
    }
}