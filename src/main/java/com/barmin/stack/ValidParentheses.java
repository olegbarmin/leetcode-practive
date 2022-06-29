package com.barmin.stack;

import java.util.ArrayDeque;
import java.util.Map;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 *
 * @leetcode 20
 * @complexity O(n)
 * @memory O(1)
 */
public class ValidParentheses {

    public static boolean isValid(String s) {
        final var chars = s.toCharArray();
        final var parentheses = Map.of(')', '(', '}', '{', ']', '[');

        final var stack = new ArrayDeque<Character>();
        for (final char aChar : chars) {
            if (parentheses.containsKey(aChar) && parentheses.get(aChar).equals(stack.peekLast())) {
                stack.pollLast();
            } else {
                stack.addLast(aChar);
            }
        }

        return stack.isEmpty();
    }
}
