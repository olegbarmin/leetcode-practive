package com.barmin.two.pointers;

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
        var map = t.chars().mapToObj(i -> (char) i)
                .collect(Collectors.toMap(c -> c, c -> 1, Integer::sum));

        int min = Integer.MAX_VALUE;
        int found = 0;
        int strStart = -1;
        for (int l = 0, r = 0; r < s.length(); r++) {
            final char rChar = s.charAt(r);
            if (!map.containsKey(rChar)) {
                continue;
            }
            final var count = map.get(rChar) - 1;
            map.put(rChar, count);
            if (count == 0) {
                found++;
            }

            // trimming left
            for (; found == map.size(); l++) {
                final char lChar = s.charAt(l);
                if (!map.containsKey(lChar)) {
                    continue;
                }

                var curLen = r + 1 - l;
                if (curLen < min) {
                    min = curLen;
                    strStart = l;
                }
                final var lCount = map.get(lChar) + 1;
                map.put(lChar, lCount);
                if (lCount > 0) {
                    found--;
                }
            }
        }

        return strStart == -1 ? "" : s.substring(strStart, strStart + min);
    }
}
