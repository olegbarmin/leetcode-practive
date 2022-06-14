package com.barmin.arrays;

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        if (nums.length < 2) {
            throw new IllegalArgumentException();
        }

        final var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;
            if (!map.containsKey(diff)) {
                map.put(num, i);
            } else {
                return new int[] {map.get(diff), i};
            }
        }

        throw new IllegalArgumentException();
    }
}
