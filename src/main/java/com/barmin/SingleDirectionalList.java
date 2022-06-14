package com.barmin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SingleDirectionalList {

    private Node head;

    void add(int v) {
        if (head == null) {
            head = new Node(v);
        } else {
            Node last = findLast();
            last.next = new Node(v);
        }
    }

    Node findLast() {
        if (head.next == null) {
            return head;
        }
        Node current = head.next;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }

    List<Integer> reverse() {
        if (head == null) {
            return Collections.emptyList();
        }
        if (head.next == null) {
            return Collections.singletonList(head.value);
        }
        final List<Integer> result = new ArrayList<>();
        traverse(head, result);
        return result;
    }

    void traverse(Node node, List<Integer> result) {
        if (node.next != null) {
            traverse(node.next, result);
            result.add(node.value);
        } else {
            result.add(node.value);
        }
    }

    private class Node {
        private final int value;
        private Node next;

        private Node(int value) {
            this.value = value;
        }
    }
}
