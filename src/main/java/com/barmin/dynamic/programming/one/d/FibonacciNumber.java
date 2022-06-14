package com.barmin.dynamic.programming.one.d;

public class FibonacciNumber {

    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        final int[] memory = new int[n];
        memory[0] = 0;
        memory[1] = 1;

        for (int i = 2; i < n; i++) {
            memory[i] = memory[i - 2] + memory[i - 1];
        }

        return memory[n - 2] + memory[n - 1];
    }
}
