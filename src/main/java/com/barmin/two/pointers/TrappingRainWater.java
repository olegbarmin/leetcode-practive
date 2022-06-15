package com.barmin.two.pointers;

/**
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it can trap after raining.
 *
 * @leetcode 42
 */
public class TrappingRainWater {

    public static int trap(int[] heights) {
        if (heights.length < 3) {
            return 0;
        }

        final int[] maxLeft = new int[heights.length];
        final int[] maxRight = new int[heights.length];

        int max = heights[0];
        for (int i = 1; i < heights.length; i++) {
            max = Math.max(max, heights[i]);
            maxLeft[i] = max;
        }

        max = heights[heights.length - 1];
        for (int i = heights.length - 2; i >= 0; i--) {
            max = Math.max(max, heights[i]);
            maxRight[i] = max;
        }

        var result = 0;
        for (int i = 0; i < heights.length; i++) {
            final var min = Math.min(maxLeft[i], maxRight[i]);
            result += Math.max(0, min - heights[i]);
        }

        return result;
    }
}
