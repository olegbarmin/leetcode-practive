package com.barmin.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvertBinaryTreeTest {

    @Test
    void test1() {
        final var input = new Integer[]{4, 2, 7, 1, 3, 6, 9};
        final var expected = new Integer[]{4, 7, 2, 9, 6, 3, 1};
        Assertions.assertArrayEquals(expected, TreeNode.toArray(InvertBinaryTree.invertTree(TreeNode.from(input))));
    }
}