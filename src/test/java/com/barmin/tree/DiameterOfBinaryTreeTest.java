package com.barmin.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DiameterOfBinaryTreeTest {

    @Test
    void test1() {
        TreeNode input = TreeNode.from(1, 2, 3, 4, 5);
        var expected = 3;

        Assertions.assertEquals(expected, DiameterOfBinaryTree.diameterOfBinaryTree(input));
    }

    @Test
    void test2() {
        TreeNode input = TreeNode.from(1, 2);
        var expected = 1;

        Assertions.assertEquals(expected, DiameterOfBinaryTree.diameterOfBinaryTree(input));
    }

    @Test
    void test3() {
        TreeNode input = TreeNode.from(1);
        var expected = 0;

        Assertions.assertEquals(expected, DiameterOfBinaryTree.diameterOfBinaryTree(input));
    }

}