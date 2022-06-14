package com.barmin.two.pointers;

public class TrappingRainWater {

    public static int trap(int[] heights) {
        if (heights.length < 3) {
            return 0;
        }

        int result = 0;
        int l = 0;
        int r = heights[heights.length - 1];

//        while (l < r) {
//            if (heights[l] < heights[r]) {
//                l += 1;
//                result = Math.min(heights[l], )
//            } else {
//                r -= 1;
//            }
//        }

        return result;
    }
}
