package com.barmin.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
