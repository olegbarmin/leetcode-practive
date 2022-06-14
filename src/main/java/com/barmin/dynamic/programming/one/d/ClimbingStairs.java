package com.barmin.dynamic.programming.one.d;

public class ClimbingStairs {

    public static int climbStairs(int n) {
        if (n == 1) return 1;

        int[] memory = new int[n + 1];
        memory[1] = 1;
        memory[2] = 2;

        // top down
        for (int i = 3; i < memory.length; i++) {
            memory[i] = memory[i - 1] + memory[i - 2];
        }

        return memory[memory.length - 1];
    }
}

