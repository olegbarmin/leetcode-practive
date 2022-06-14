package com.barmin.binary.search;

public class Search2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int[] targetArray = null;
        for (int[] row : matrix) {
            if (row[0] <= target && row[matrix[0].length - 1] >= target){
                targetArray = row;
                break;
            }
        }

        if (targetArray == null) return false;


        int l = 0;
        int r = targetArray.length - 1;

        while (l <= r) {
            int m = (r + l) / 2;
            int v = targetArray[m];

            if (v == target) return true;

            if (target < v) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return false;
    }
}
