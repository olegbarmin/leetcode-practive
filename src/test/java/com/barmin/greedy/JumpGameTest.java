package com.barmin.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JumpGameTest {

    @Test
    void test() {
        final int[] input = {2, 3, 1, 1, 4};
        final var expected = true;

        Assertions.assertEquals(expected, JumpGame.canJump(input));
    }

    @Test
    void test2() {
        final int[] input = {3, 2, 1, 0, 4};
        final var expected = false;

        Assertions.assertEquals(expected, JumpGame.canJump(input));
    }

}