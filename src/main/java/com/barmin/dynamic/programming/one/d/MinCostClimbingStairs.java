package com.barmin.dynamic.programming.one.d;

public class MinCostClimbingStairs {

    public static int minCostClimbingStairs(int[] cost) {
        final int[] moves = new int[cost.length];
        moves[0] = cost[0];
        moves[1] = cost[1];

        for (int i = 2; i < moves.length; i++) {
            moves[i] = cost[i] + Math.min(moves[i - 1], moves[i - 2]);
        }
        return Math.min(moves[moves.length - 1], moves[moves.length - 2]);
    }
}
