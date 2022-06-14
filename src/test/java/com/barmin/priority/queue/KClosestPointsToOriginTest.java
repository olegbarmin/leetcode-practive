package com.barmin.priority.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KClosestPointsToOriginTest {

    @Test
    void test1() {
        int[][] points = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;

        int[][] expected = {{-2, 4}, {3, 3}};
        Assertions.assertArrayEquals(expected, KClosestPointsToOrigin.kClosest(points, k));
    }
}