package com.barmin.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class InvertBinaryTree {

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        final var stack = new ArrayDeque<TreeNode>();
        stack.add(root);
        while (!stack.isEmpty()) {
            final var node = stack.pop();

            final var temp = node.left;
            node.left = node.right;
            node.right = temp;

            if (node.left != null) {
                stack.add(node.left);
            }
            if (node.right != null) {
                stack.add(node.right);
            }
        }
        return root;
    }


    public static void swap(TreeNode node) {
        if (node == null) {
            return;
        }

        final var temp = node.left;
        node.left = node.right;
        node.right = temp;

        swap(node.left);
        swap(node.right);
    }
}
