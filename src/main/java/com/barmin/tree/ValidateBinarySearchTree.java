package com.barmin.tree;

public class ValidateBinarySearchTree {

    public static boolean isValidBST(TreeNode root) {
        if (root == null) return true;

        return dfs(root, null, null);
    }

    public static boolean dfs(TreeNode node, Integer min, Integer max) {
        if (node == null) return true;
        if ((min != null && node.val <= min) || (max != null && node.val >= max)) return false;

        return dfs(node.left, min, node.val) && dfs(node.right, node.val, max);
    }
}
