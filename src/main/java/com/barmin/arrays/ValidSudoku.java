package com.barmin.arrays;

import java.util.*;

/**
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according
 * to the following rules:
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition
 *
 * @leetcode 36
 * @complexity O(n)
 * @memory O(n)
 */
public class ValidSudoku {

    public static boolean isValidSudoku(char[][] board) {
        final var rows = new HashMap<Integer, Set<Character>>();
        final var columns = new HashMap<Integer, Set<Character>>();
        final var squares = new HashMap<String, Set<Character>>();

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                final var number = board[r][c];
                if (number == '.') {
                    continue;
                }
                final var squareKey = (r / 3) + "-" + (c / 3);
                if (putIfNotContains(r, number, rows)
                        || putIfNotContains(c, number, columns)
                        || putIfNotContains(squareKey, number, squares)) {
                    return false;
                }
            }
        }

        return true;
    }

    private static <K> boolean putIfNotContains(K key, Character value, Map<K, Set<Character>> map) {
        final var values = map.getOrDefault(key, new HashSet<>());

        var result = true;
        if (!values.contains(value)) {
            values.add(value);
            map.put(key, values);
            result = false;
        }
        return result;
    }
}
