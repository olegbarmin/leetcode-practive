package com.barmin.sliding.window.medium;

import java.util.Collections;
import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {

    public static int characterReplacement(String s, int k) {
        var max = 0;
        final var window = new HashMap<Character, Integer>();
        char[] chars = s.toCharArray();
        for (int l = 0, r = 0; r < chars.length; r++) {
            window.put(chars[r], window.getOrDefault(chars[r], 0) + 1);
            while ((r - l + 1) - Collections.max(window.values()) > k) {
                window.put(chars[l], window.get(chars[l]) - 1);
                l++;
            }
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}
