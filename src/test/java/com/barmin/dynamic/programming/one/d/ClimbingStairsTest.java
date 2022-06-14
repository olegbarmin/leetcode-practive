package com.barmin.dynamic.programming.one.d;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClimbingStairsTest {

    @Test
    void test1() {
        int input = 2;
        int actual = ClimbingStairs.climbStairs(input);
        Assertions.assertEquals(2, actual);
    }

    @Test
    void test2() {
        int input = 3;
        int actual = ClimbingStairs.climbStairs(input);
        Assertions.assertEquals(3, actual);
    }

    @Test
    void test3() {
        int input = 5;
        int actual = ClimbingStairs.climbStairs(input);
        Assertions.assertEquals(8, actual);
    }


    @Test
    void test4() {
        int input = 35;
        int actual = ClimbingStairs.climbStairs(input);
        Assertions.assertEquals(14930352, actual);
    }
}