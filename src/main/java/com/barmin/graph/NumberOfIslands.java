package com.barmin.graph;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class NumberOfIslands {
    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        var result = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if (grid[r][c] == '1') {
                    grid[r][c] = '+';
                    dfs(grid, r, c);
                    result++;
                }
            }
        }

        return result;
    }

    public static void dfs(char[][] grid, int row, int column) {
        List<int[]> directions = List.of(
                new int[]{1, 0}, // UP
                new int[]{-1, 0}, // DOWN
                new int[]{0, -1}, // LEFT
                new int[]{0, 1} // RIGHT
        );

        final Deque<int[]> stack = new ArrayDeque<>();
        stack.add(new int[]{row, column});
        while (!stack.isEmpty()) {
            int[] cords = stack.pollLast();
            row = cords[0];
            column = cords[1];
            for (int[] direction : directions) {
                int r = row + direction[0];
                int c = column + direction[1];
                if (in(r, grid.length) && in(c, grid[0].length) && grid[r][c] == '1') {
                    grid[r][c] = '+';
                    stack.add(new int[]{r, c});
                }
            }
        }
    }

    private static boolean in(int v, int maxExc) {
        return v >= 0 && v < maxExc;
    }
}
