package com.barmin.linked.list;

import java.util.ArrayList;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    static ListNode list(int... args) {
        ListNode preHead = new ListNode();
        ListNode curr = preHead;
        for (int arg : args) {
            curr.next = new ListNode(arg);
            curr = curr.next;
        }
        return preHead.next;
    }

    static int[] from(ListNode node) {
        final var list = new ArrayList<Integer>();
        var cur = node;
        while (cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
