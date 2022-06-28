package com.barmin.two.pointers;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Given two strings s and t of lengths m and n respectively, return the minimum window substring of
 * s such that every character in t (including duplicates) is included in the window. If there
 * is no such substring, return the empty string "".
 * <p>
 * The testcases will be generated such that the answer is unique.
 * <p>
 * A substring is a contiguous sequence of characters within the string.
 *
 * @leetcode 76
 * @complexity O(m + n)
 * @memory O(n)
 */
public class MinimumWindowSubstring {

    public static String minWindow(String s, String t) {
        var tLetters = t.chars().mapToObj(i -> (char) i)
                .collect(Collectors.toMap(c -> c, c -> 1, Integer::sum));

        String min = "";
        var window = new HashMap<Character, Integer>();
        var found = 0;
        for (int l = 0, r = 0; r < s.length(); r++) {
            final char rChar = s.charAt(r);
            if (!tLetters.containsKey(rChar)) {
                continue;
            }

            final var count = window.getOrDefault(rChar, 0) + 1;
            window.put(rChar, count);
            if (count == tLetters.get(rChar)) {
                found++;
            }

            // trimming left
            for (; found == tLetters.size(); l++) {
                final char lChar = s.charAt(l);
                if (!tLetters.containsKey(lChar)) {
                    continue;
                }

                final String cur = s.substring(l, r + 1);
                if (min.isEmpty()) {
                    min = cur;
                }
                min = cur.length() < min.length() ? cur : min;

                final int lCount = window.get(lChar) - 1;
                window.put(lChar, lCount);
                if (lCount < tLetters.get(lChar)) {
                    found--;
                }
            }
        }

        return min;
    }
}
