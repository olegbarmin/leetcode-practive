package com.barmin.trie;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Trie {

    private final Node root = new Node(null);

    public Trie() {

    }

    public void insert(String word) {
        char[] chars = word.toCharArray();

        var cur = root;
        for (char character : chars) {
            final var child = cur.get(character);
            if (child != null) {
                cur = child;
            } else {
                cur = cur.put(character);
            }
        }
        cur.wordEnd = true;
    }

    public boolean search(String word) {
        char[] chars = word.toCharArray();

        var cur = root;
        for (char character : chars) {
            final var child = cur.get(character);
            if (child == null) return false;
            cur = child;
        }
        return cur.wordEnd;
    }

    public boolean startsWith(String prefix) {
        char[] chars = prefix.toCharArray();

        var cur = root;
        for (char character : chars) {
            final var child = cur.get(character);
            if (child == null) return false;
            cur = child;
        }
        return true;
    }

    private static class Node {

        private final Character character;
        private boolean wordEnd;
        private final Map<Character, Node> children = new HashMap<>();

        private Node(Character character) {
            this.character = character;
        }

        Node get(Character character) {
            return children.get(character);
        }

        Node put(Character character) {
            if (get(character) != null) {
                throw new IllegalStateException("Child for letter " + character + " already exists");
            }
            Node child = new Node(character);
            children.put(character, child);
            return child;
        }

        @Override
        public String toString() {
            return this.character + " -> " + children.values().stream()
                    .map(n -> n.character.toString())
                    .collect(Collectors.joining(", "));
        }
    }
}
