package com.barmin.greedy;

public class JumpGame {

    public static boolean canJump(int[] nums) {
        if (nums.length == 1) return true;

        int reachableIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (reachableIndex < i) break;
            reachableIndex = Math.max(reachableIndex, i + nums[i]);
        }
        return reachableIndex >= nums.length - 1;
    }
}
