package com.barmin.two.pointers;

/**
 * You are given an integer array height of length n. There are n vertical lines
 * drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * <p>
 * Find two lines that together with the x-axis form a container, such that
 * the container contains the most water.
 * <p>
 * Return the maximum amount of water a container can store.
 *
 * @leetcode 11
 * @complexity O(n)
 * @memory O(1)
 */
public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        if (height.length < 2) {
            return 0;
        }

        int max = 0;
        int l = 0;
        int r = height.length - 1;

        while (l < r) {

            final var distance = r - l;
            int area;
            if (height[l] > height[r]) {
                area = height[r] * distance;
                r--;
            } else {
                area = height[l] * distance;
                l++;
            }
            max = Math.max(area, max);
        }
        return max;
    }
}
