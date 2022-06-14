package com.barmin.tree;

import java.util.concurrent.atomic.AtomicInteger;

public class DiameterOfBinaryTree {

    public static int diameterOfBinaryTree(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) return 0;

        var result = new AtomicInteger(0);
        traverse(root, 0, result);
        return result.intValue();
    }


    public static int traverse(TreeNode node, int depth, AtomicInteger integer) {
        if (node == null) {
            return depth;
        }

        depth += 1;
        int lDepth = traverse(node.left, depth, integer);
        int rDepth = traverse(node.right, depth, integer);

        int length = (lDepth - depth) + (rDepth - depth);
        integer.set(Math.max(integer.intValue(), length));

        return Math.max(lDepth, rDepth);
    }

}
