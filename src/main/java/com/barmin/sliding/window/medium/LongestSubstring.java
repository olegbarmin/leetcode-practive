package com.barmin.sliding.window.medium;

import java.util.HashSet;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 * @leetcode 3
 * @complexity O(n)
 * @memory O(n)
 */
public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        final var set = new HashSet<Character>();
        for (int l = 0, r = 0; r < s.length(); r++) {
            final var rChar = s.charAt(r);
            while (set.contains(rChar)) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(rChar);
            max = Math.max(max, set.size());
        }

        return max;
    }
}
