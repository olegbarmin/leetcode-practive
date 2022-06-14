package com.barmin.greedy;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int max = nums[0];
        int curSum = max;
        for (int i = 1; i < nums.length; i++) {
            if (curSum < 0) curSum = 0;
            curSum += nums[i];
            max = Math.max(curSum, max);
        }

        return max;
    }
}
