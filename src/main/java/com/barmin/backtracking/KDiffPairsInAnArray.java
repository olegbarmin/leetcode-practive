package com.barmin.backtracking;

import java.util.HashMap;

public class KDiffPairsInAnArray {

    public static int findPairs(int[] nums, int k) {
        if (nums.length < 2) {
            return 0;
        }

        final var map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        var result = 0;
        for (Integer num : map.keySet()) {
            int target = num + k;
            if (k > 0 && map.containsKey(target) || k == 0 && map.getOrDefault(target, 0) > 1) {
                result++;
            }
        }

        return result;
    }
}
