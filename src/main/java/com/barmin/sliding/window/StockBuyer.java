package com.barmin.sliding.window;

public class StockBuyer {

    public static int maxProfit(int[] prices) {
        var max = 0;
        for (int r = 1, l = 0; r < prices.length; r++) {
            if (prices[l] < prices[r]) {
                max = Math.max(max, prices[r] - prices[l]);
            } else {
                l = r;
            }
        }
        return max;
    }
}