package com.barmin.tree;

class RBTreeTest {
    // Every node has color
    // Root and Leaves are always BLACK
    // Every new node is Red
    // Every RED node has only BLACK children
    // For each node, any simple path from this node to any of its descendant leaf has the same number of black nodes.
    private Node root;

    private void insert(int newValue) {
        if (root == null) {
            root = new Node(newValue, Colour.BLACK);
            return;
        }

        // insertion to the bottom
        Node grantParent = null;
        Node parent = null;
        var cur = root;
        while (cur != null) {
            grantParent = parent;
            parent = cur;
            if (newValue > cur.value) {
                cur = cur.rightChild;
            } else {
                cur = cur.leftChild;
            }
        }

        if (parent.value > newValue) {
            parent.rightChild = new Node(newValue, Colour.RED);
        } else {
            parent.leftChild = new Node(newValue, Colour.RED);
        }

        // balancing after insertion
        if (parent.colour == Colour.BLACK) {
            return;
        }

        // case 1
        if (grantParent.rightChild.colour == Colour.RED) {

        }

    }

    private static class Node {
        private Colour colour;
        private int value;
        private Node leftChild;
        private Node rightChild;

        Node(int value, Colour colour) {
            this.value = value;
            this.colour = colour;
        }
    }

    private static enum Colour {RED, BLACK}
}