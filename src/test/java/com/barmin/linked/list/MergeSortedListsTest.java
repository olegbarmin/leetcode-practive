package com.barmin.linked.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.barmin.linked.list.ListNode.from;
import static com.barmin.linked.list.ListNode.list;

class MergeSortedListsTest {


    @Test
    void test1() {
        ListNode l1 = list(1, 2, 4);
        ListNode l2 = list(1, 3, 4);

        var expected = new int[] {1,1,2,3,4,4};
        var actual = from(MergeSortedLists.mergeTwoLists(l1, l2));

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    void test2() {
        ListNode l1 = list();
        ListNode l2 = list(0);

        var expected = new int[] {0};
        var actual = from(MergeSortedLists.mergeTwoLists(l1, l2));

        Assertions.assertArrayEquals(expected, actual);
    }
}