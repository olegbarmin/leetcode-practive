package com.barmin.arrays;

/**
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all
 * the elements of nums except nums[i].
 * <p>
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * <p>
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 *
 * @leetcode 238
 * @complexity O(n)
 * @memory O(1)
 */
public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        final int[] result = new int[nums.length];
        int prefix = 1;
        for (int i = 0; i < result.length; i++) {
            result[i] = prefix;
            prefix = prefix * nums[i];
        }

        int postfix = 1;
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = result[i] * postfix;
            postfix *= nums[i];
        }
        return result;
    }
}
