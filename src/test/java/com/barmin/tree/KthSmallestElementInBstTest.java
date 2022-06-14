package com.barmin.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KthSmallestElementInBstTest {

    @Test
    void test1() {
        final var input = TreeNode.from(3, 1, 4, null, 2);
        final var k = 1;

        Assertions.assertEquals(1, KthSmallestElementInBst.kthSmallest(input, k));
    }

    @Test
    void test2() {
        final var input = TreeNode.from(5, 3, 6, 2, 4, null, null, 1);
        final var k = 3;

        Assertions.assertEquals(3, KthSmallestElementInBst.kthSmallest(input, k));
    }

    @Test
    void test3() {
        final var input = TreeNode.from(1, null, 2);
        final var k = 2;

        Assertions.assertEquals(2, KthSmallestElementInBst.kthSmallest(input, k));
    }
}