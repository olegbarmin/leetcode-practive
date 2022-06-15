package com.barmin.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
        var map = new HashMap<String, List<String>>();
        for (var s : strs) {
            char[] hash = new char[26];
            for (var c : s.toCharArray()) {
                hash[c - 'a']++;
            }
            var key = new String(hash);
            List<String> words = map.getOrDefault(key, new ArrayList<>());
            words.add(s);
            map.put(key, words);
        }
        return map.values().stream().toList();
    }
}
