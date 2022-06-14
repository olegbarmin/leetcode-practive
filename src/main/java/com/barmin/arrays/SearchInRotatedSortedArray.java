package com.barmin.arrays;

public class SearchInRotatedSortedArray {

    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            int v = nums[m];
            if (v == target) return m;
            if (target < v) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }
}
