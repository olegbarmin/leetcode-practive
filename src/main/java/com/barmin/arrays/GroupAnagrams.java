package com.barmin.arrays;

import java.util.*;

/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 *
 * @leetcode 49
 * @complexity O(m * n), m - input string, n - avg word number
 * @memory O(n)
 */
public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        final var map = new HashMap<String, List<String>>();
        for (String word : strs) {
            final char[] hash = new char[26];
            for (char letter : word.toCharArray()) {
                hash[letter - 'a']++;
            }
            final var key = new String(hash);
            final var anagrams = map.getOrDefault(key, new ArrayList<>());
            anagrams.add(word);
            map.put(key, anagrams);
        }
        return map.values().stream().toList();
    }
}
