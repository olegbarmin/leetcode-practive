package com.barmin.arrays;

import java.util.HashMap;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * @leetcode 242
 * @complexity O(n)
 * @memory O(n)
 */
public class AnagramValidator {

    public static boolean isAnagram(String l, String r) {
        if (l.length() != r.length()) {
            return false;
        }

        final var lMap = readMap(l);
        final var rMap = readMap(r);

        return lMap.equals(rMap);
    }

    static HashMap<Character, Integer> readMap(String input) {
        char[] chars = input.toCharArray();

        final var map = new HashMap<Character, Integer>(chars.length);
        for (char c : chars) {
            Integer occurrences = map.getOrDefault(c, 0);
            map.put(c, occurrences + 1);
        }

        return map;
    }
}
