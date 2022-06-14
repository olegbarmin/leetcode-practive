package com.barmin.tree;

import java.util.ArrayDeque;

public class MaximumDepth {

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }

        final var stack = new ArrayDeque<TreeNode>();
        stack.add(root);

        var depth = 0;
        while (!stack.isEmpty()) {
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                final var node = stack.pop();
                if (node.left != null) {
                    stack.add(node.left);
                }
                if (node.right != null) {
                    stack.add(node.right);
                }
            }
            depth++;
        }
        return depth;
    }
}
