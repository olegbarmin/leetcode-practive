package com.barmin.linked.list;

public class MergeSortedLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        var cur1 = list1;
        var cur2 = list2;

        final ListNode preHead = new ListNode();
        ListNode cur = preHead;
        while (cur1 != null && cur2 != null) {
            if (cur1.val < cur2.val) {
                cur.next = cur1;
                cur1 = cur1.next;
            } else {
                cur.next = cur2;
                cur2 = cur2.next;
            }
            cur = cur.next;
        }

        cur.next = cur1 == null ? cur2 : cur1;
        return preHead.next;
    }
}
