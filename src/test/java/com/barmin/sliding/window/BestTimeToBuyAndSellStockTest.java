package com.barmin.sliding.window;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellStockTest {

    @Test
    void test1() {
        final var input = new int[]{7, 1, 5, 3, 6, 4};
        Assertions.assertEquals(5, BestTimeToBuyAndSellStock.maxProfit(input));
    }

    @Test
    void test2() {
        final var input = new int[]{7, 6, 4, 3, 1};
        Assertions.assertEquals(0, BestTimeToBuyAndSellStock.maxProfit(input));
    }

    @Test
    void test3() {
        final var input = new int[]{2, 6, 2, 8, 1};
        Assertions.assertEquals(6, BestTimeToBuyAndSellStock.maxProfit(input));
    }
}