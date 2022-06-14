package com.barmin.sliding.window.medium;

import java.util.HashSet;

public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        var max = 0;
        final var set = new HashSet<>();
        for (int r = 0, l = 0; r < chars.length; r++) {
            while (set.contains(chars[r])) {
                set.remove(chars[l]);
                l++;
            }
            set.add(chars[r]);
            max = Math.max(max, set.size());
        }
        return max;
    }
}
