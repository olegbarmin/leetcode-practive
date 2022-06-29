package com.barmin.sliding.window.medium;

import java.util.HashMap;

/**
 * You are given a string s and an integer k. You can choose any character
 * of the string and change it to any other uppercase English character.
 * You can perform this operation at most k times.
 *
 * @leetcode 424
 * @complexity O(n)
 * @memory O(n)
 */
public class LongestRepeatingCharacterReplacement {

    public static int characterReplacement(String s, int k) {
        final var map = new HashMap<Character, Integer>();
        final var chars = s.toCharArray();

        var max = 0;
        var maxCount = 0;
        for (int l = 0, r = 0; r < chars.length; r++) {
            final var count = map.getOrDefault(chars[r], 0) + 1;
            map.put(chars[r], count);
            maxCount = Math.max(maxCount, count);
            while (r - l + 1 - maxCount > k) {
                map.put(chars[l], map.get(chars[l]) - 1);
                l++;
            }
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}
