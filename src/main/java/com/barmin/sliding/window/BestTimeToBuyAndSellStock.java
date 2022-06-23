package com.barmin.sliding.window;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * <p>
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a
 * different day in the future to sell that stock.
 * <p>
 * Return the maximum profit you can achieve from this transaction.
 * If you cannot achieve any profit, return 0.
 *
 * @leetcode 121
 * @complexity O(n)
 * @memory O(1)
 */
public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int max = 0;
        for (int l = 0, r = 1; r < prices.length; r++) {
            max = Math.max(prices[r] - prices[l], max);
            if (prices[r] < prices[l]) {
                l = r;
            }
        }
        return max;
    }
}