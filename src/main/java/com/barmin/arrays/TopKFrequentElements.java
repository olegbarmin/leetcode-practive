package com.barmin.arrays;

import java.util.*;

/**
 * Given an integer array nums and an integer k, return the k most frequent elements.
 * You may return the answer in any order.
 *
 * @leetcode 347
 * @complexity O(n)
 * @memory O(n)
 */
public class TopKFrequentElements {

    public static int[] topKFrequent(int[] nums, int k) {
        final var frequencies = new HashMap<Integer, Integer>();
        for (int num : nums) {
            int frequency = frequencies.getOrDefault(num, 0);
            frequencies.put(num, ++frequency);
        }

        final var top = new List[nums.length + 1];
        for (final var e : frequencies.entrySet()) {
            final var list = top[e.getValue()] == null ? new ArrayList<>() : top[e.getValue()];
            list.add(e.getKey());
            top[e.getValue()] = list;
        }

        var result = new ArrayList<Integer>();
        for (int i = top.length - 1; i >= 0 && k > 0; i--) {
            if (top[i] == null) continue;
            for (var item : top[i]) {
                result.add((Integer) item);
                k--;
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
