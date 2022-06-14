package com.barmin.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidateBinarySearchTreeTest {

    @Test
    void test1() {
        final Integer[] input = {2, 1, 3};
        TreeNode root = TreeNode.from(input);

        Assertions.assertTrue(ValidateBinarySearchTree.isValidBST(root));
    }

    @Test
    void test2() {
        final Integer[] input = {5, 1, 4, null, null, 3, 6};
        TreeNode root = TreeNode.from(input);

        Assertions.assertFalse(ValidateBinarySearchTree.isValidBST(root));
    }

    @Test
    void test3() {
        final Integer[] input = {2, 2, 2};
        TreeNode root = TreeNode.from(input);

        Assertions.assertFalse(ValidateBinarySearchTree.isValidBST(root));
    }

    @Test
    void test4() {
        final Integer[] input = {5, 4, 6, null, null, 3, 7};
        TreeNode root = TreeNode.from(input);

        Assertions.assertFalse(ValidateBinarySearchTree.isValidBST(root));
    }

    @Test
    void test5() {
        final Integer[] input = {-2147483648, null, 2147483647};
        TreeNode root = TreeNode.from(input);

        Assertions.assertTrue(ValidateBinarySearchTree.isValidBST(root));
    }
}