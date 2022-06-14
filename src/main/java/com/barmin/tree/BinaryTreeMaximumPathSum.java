package com.barmin.tree;

import java.util.concurrent.atomic.AtomicInteger;

public class BinaryTreeMaximumPathSum {

    public static int maxPathSum(TreeNode root) {
        AtomicInteger max = new AtomicInteger(root.val);
        dfs(root, max);
        return max.intValue();
    }

    private static int dfs(TreeNode node, AtomicInteger max) {
        if (node == null) return 0;

        var left = dfs(node.left, max);
        var right = dfs(node.right, max);

        var totalSum = node.val + left + right;
        int splitSum = Math.max(Math.max(node.val + left, node.val + right), node.val);

        int localMax = Math.max(splitSum, totalSum);
        if (max.intValue() < localMax) max.set(localMax);

        return splitSum;
    }
}
