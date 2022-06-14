package com.barmin.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TreeNodeTest {

    @Test
    void from1() {
        final var input = new Integer[]{1, 2, 3};

        TreeNode root = TreeNode.from(input);
        Assertions.assertEquals(1, root.val);
        Assertions.assertEquals(2, root.left.val);
        Assertions.assertEquals(3, root.right.val);
    }

    @Test
    void from2() {
        final var input = new Integer[]{4, 2, 7, 1, 3, 6, 9};

        TreeNode root = TreeNode.from(input);
        Assertions.assertEquals(4, root.val);

        Assertions.assertEquals(2, root.left.val);
        Assertions.assertEquals(7, root.right.val);

        Assertions.assertEquals(1, root.left.left.val);
        Assertions.assertEquals(3, root.left.right.val);

        Assertions.assertEquals(6, root.right.left.val);
        Assertions.assertEquals(9, root.right.right.val);
    }

    @Test
    void from3() {
        final var input = new Integer[]{4, 2, 7, 1, 3, 6};

        TreeNode root = TreeNode.from(input);
        Assertions.assertEquals(4, root.val);

        Assertions.assertEquals(2, root.left.val);
        Assertions.assertEquals(7, root.right.val);

        Assertions.assertEquals(1, root.left.left.val);
        Assertions.assertEquals(3, root.left.right.val);

        Assertions.assertEquals(6, root.right.left.val);
    }


    @Test
    void to1() {
        final TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        root.right.left = new TreeNode(6);


        final var expected = new Integer[]{4, 2, 7, 1, 3, 6};
        Assertions.assertArrayEquals(expected, TreeNode.toArray(root));
    }

}