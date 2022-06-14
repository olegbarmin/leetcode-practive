package com.barmin.stack;

import java.util.ArrayDeque;
import java.util.Map;

public class ValidParentheses {

    public static boolean isValid(String s) {
        final var map = Map.of(')', '(', ']', '[', '}', '{');
        final var stack = new ArrayDeque<Character>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c) && map.get(c) == stack.peek()) {
                stack.pop();
            } else if (map.containsKey(c)) {
                return false;
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
