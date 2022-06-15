package com.barmin.two.pointers;

/**
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it can trap after raining.
 *
 * @leetcode 42
 * @complexity O(n)
 * @memory O(1)
 */
public class TrappingRainWater {

    public static int trap(int[] heights) {
        if (heights.length < 3) {
            return 0;
        }

        int l = 0;
        int r = heights.length - 1;
        var maxLeft = heights[l];
        var maxRight = heights[r];
        var result = 0;

        while (l < r) {
            if (maxLeft < maxRight) {
                l += 1;
                maxLeft = Math.max(maxLeft, heights[l]);
                result += maxLeft - heights[l];
            } else {
                r -= 1;
                maxRight = Math.max(maxRight, heights[r]);
                result += maxRight - heights[r];
            }
        }

        return result;
    }
}
