package com.barmin.dynamic.programming.one.d;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FibonacciNumberTest {

    @Test
    void test1() {
        int input = 0;
        int expected = 0;

        Assertions.assertEquals(expected, FibonacciNumber.fib(input));
    }

    @Test
    void test2() {
        int input = 1;
        int expected = 1;

        Assertions.assertEquals(expected, FibonacciNumber.fib(input));
    }


    @Test
    void test3() {
        int input = 3;
        int expected = 2;

        Assertions.assertEquals(expected, FibonacciNumber.fib(input));
    }

    @Test
    void test4() {
        int input = 4;
        int expected = 3;

        Assertions.assertEquals(expected, FibonacciNumber.fib(input));
    }
}