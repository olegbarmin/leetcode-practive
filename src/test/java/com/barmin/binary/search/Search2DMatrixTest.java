package com.barmin.binary.search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Search2DMatrixTest {

    @Test
    void test1() {
        final int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}};
        final int target = 3;

        Assertions.assertTrue(Search2DMatrix.searchMatrix(matrix, target));
    }

    @Test
    void test2() {
        final int[][] matrix = {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        final int target = 3;

        Assertions.assertTrue(Search2DMatrix.searchMatrix(matrix, target));
    }

}