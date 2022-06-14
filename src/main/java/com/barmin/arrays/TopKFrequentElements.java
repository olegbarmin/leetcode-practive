package com.barmin.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        var map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            var occurrences = map.getOrDefault(num, 0);
            occurrences++;
            map.put(num, occurrences);
        }

        var top = new List[nums.length + 1];
        for (var entry : map.entrySet()) {
            List<Integer> list = top[entry.getValue()];
            if (list == null) list = new ArrayList<Integer>();
            list.add(entry.getKey());
            top[entry.getValue()] = list;
        }

        var result = new ArrayList<Integer>();
        for (int i = top.length - 1; i > 0 && k > 0; i--) {
            List<Integer> list = top[i];
            if (list == null) continue;
            for (int j = 0; j < list.size() && k > 0; j++, k--) {
                result.add(list.get(j));
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
