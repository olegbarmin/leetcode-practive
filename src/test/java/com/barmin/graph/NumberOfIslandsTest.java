package com.barmin.graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberOfIslandsTest {


    @Test
    void test1() {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
        };

        Assertions.assertEquals(1, NumberOfIslands.numIslands(grid));
    }

    @Test
    void test2() {
        char[][] grid = {
                {'0', '1', '0'},
                {'1', '0', '1'},
                {'0', '1', '0'}
        };

        Assertions.assertEquals(4, NumberOfIslands.numIslands(grid));
    }

}