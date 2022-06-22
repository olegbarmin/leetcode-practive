package com.barmin.two.pointers;

/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all
 * non-alphanumeric characters, it reads the same forward and backward.
 * Alphanumeric characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *
 * @leetcode 125
 * @complexity O(n)
 * @memory O(1)
 */
public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        final var chars = s.toLowerCase().toCharArray();

        for (int l = 0, r = chars.length - 1; l < r;) {
            if (isNotAllowed(chars[l])) {
                l++;
            } else if (isNotAllowed(chars[r])) {
                r--;
            } else if (chars[l] == chars[r]) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }

    private static boolean isNotAllowed(char chars) {
        return !(Character.isAlphabetic(chars) || Character.isDigit(chars));
    }
}
