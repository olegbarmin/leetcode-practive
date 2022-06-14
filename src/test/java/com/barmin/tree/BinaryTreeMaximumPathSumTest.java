package com.barmin.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinaryTreeMaximumPathSumTest {

    @Test
    void test1() {
        final var root = TreeNode.from(1, 2, 3);
        final var expected = 6;

        Assertions.assertEquals(expected, BinaryTreeMaximumPathSum.maxPathSum(root));
    }

    @Test
    void test2() {
        final var root = TreeNode.from(-10, 9, 20, null, null, 15, 7);
        final var expected = 42;

        Assertions.assertEquals(expected, BinaryTreeMaximumPathSum.maxPathSum(root));
    }

    @Test
    void test3() {
        final var root = TreeNode.from(-3);
        final var expected = -3;

        Assertions.assertEquals(expected, BinaryTreeMaximumPathSum.maxPathSum(root));
    }

    @Test
    void test4() {
        final var root = TreeNode.from(1, -2, 3);
        final var expected = 4;

        Assertions.assertEquals(expected, BinaryTreeMaximumPathSum.maxPathSum(root));
    }

    @Test
    void test5() {
        final var root = TreeNode.from(-1, -2, 10, -6, null, -3, -6);
        final var expected = 10;

        Assertions.assertEquals(expected, BinaryTreeMaximumPathSum.maxPathSum(root));
    }
}