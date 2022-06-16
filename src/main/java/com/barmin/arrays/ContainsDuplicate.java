package com.barmin.arrays;

import java.util.HashSet;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 *
 * @leetcode 217
 * @complexity O(n)
 * @memory O(n)
 */
public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        final var set = new HashSet<Integer>();
        for (int num : nums) {
            if (set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }
}
