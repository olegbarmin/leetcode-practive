package com.barmin.arrays;

/**
 * There is an integer array nums sorted in ascending order (with distinct values).
 * Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length)
 * such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
 * For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
 * <p>
 * Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums,
 * or -1 if it is not in nums.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * @leetcode 33
 * @memory O(1)
 * @complexity O(log n)
 */
public class SearchInRotatedSortedArray {

    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (nums[m] == target) return m;

            // M in Left (with bigger numbers) part
            if (nums[l] <= nums[m]) {
                if (target > nums[m] || target < nums[l]) {
                    l = m + 1; // >> search to the right
                } else {
                    r = m - 1; // >> search to the left
                }
            }
            // M in Right (with smaller numbers) part
            else {
                if (target < nums[m] || target > nums[r]) {
                    r = m - 1; // >> search to the left
                } else {
                    l = m + 1; // >> search to the right
                }
            }
        }
        return -1;
    }
}
