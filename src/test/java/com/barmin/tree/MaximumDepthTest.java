package com.barmin.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximumDepthTest {

    @Test
    void test1() {
        final var input = new Integer[]{3, 9, 20, null, null, 15, 7};
        int actual = MaximumDepth.maxDepth(TreeNode.from(input));
        Assertions.assertEquals(3, actual);
    }

    @Test
    void test2() {
        final var input = new Integer[]{0, 2, 4, 1, null, 3, -1, 5, 1, null, 6, null, 8};

        TreeNode inputRoot = TreeNode.from(input);
        int actual = MaximumDepth.maxDepth(inputRoot);
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }
}