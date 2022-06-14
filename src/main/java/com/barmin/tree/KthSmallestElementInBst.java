package com.barmin.tree;

import java.util.ArrayDeque;

public class KthSmallestElementInBst {

    public static Integer kthSmallest(TreeNode root, int k) {
        final var stack = new ArrayDeque<TreeNode>();
        var cur = root;
        while (!stack.isEmpty() || cur != null) {
            while (cur != null) {
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.pollLast();
            k--;
            if (k == 0) {
                return cur.val;
            }
            cur = cur.right;
        }

        throw new IllegalStateException();
    }
}
