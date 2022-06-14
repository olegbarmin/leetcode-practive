package com.barmin.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class TreeNode {
    Integer val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(Integer val) {
        this.val = val;
    }

    TreeNode(Integer val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        Integer lVal = left != null ? left.val : null;
        Integer rVal = right != null ? right.val : null;
        return this.val + ": " + lVal + ", " + rVal;
    }

    public static TreeNode from(Integer... args) {
        var root = new TreeNode(args[0]);
        put(root, 0, args);
        return root;
    }

    public static Integer[] toArray(TreeNode root) {
        if (root == null) {
            return new Integer[]{};
        }
        final var result = new ArrayList<Integer>();
        final var stack = new ArrayDeque<TreeNode>();
        stack.add(root);
        while (!stack.isEmpty()) {
            final var node = stack.pop();
            result.add(node.val);
            if (node.left != null) {
                stack.add(node.left);
            }
            if (node.right != null) {
                stack.add(node.right);
            }
        }

        return result.toArray(new Integer[0]);
    }

    private static void put(TreeNode node, Integer n, Integer[] args) {
        if (node == null) {
            return;
        }
        if (2 * n + 1 < args.length) {
            Integer value = args[2 * n + 1];
            if (value != null) {
                node.left = new TreeNode(value);
                put(node.left, 2 * n + 1, args);
            }
        }
        if (2 * n + 2 < args.length) {
            Integer value = args[2 * n + 2];
            if (value != null) {
                node.right = new TreeNode(value);
                put(node.right, 2 * n + 2, args);
            }
        }
    }
}
