package com.barmin.arrays;

import java.util.HashMap;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers
 * such that they add up to target.
 *
 * @leetcode 1
 * @complexity O(n)
 * @memory O(n)
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        final var map = new HashMap<Integer, Integer>(); // Remainder to index
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            int remainder = target - nums[i];
            map.put(remainder, i);
        }

        throw new IllegalArgumentException();
    }
}
