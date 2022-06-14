package com.barmin.two.pointers;

import java.util.Locale;

public class PalindromeValidator {

    public static boolean isPalindrome(String s) {
        char[] chars = s.toLowerCase(Locale.ROOT).toCharArray();
        for (int i = 0, j = chars.length - 1; i != j; ) {
            if (!isAlNum(chars[i])) {
                i++;
            } else if (!isAlNum(chars[j])) {
                j--;
            } else if (chars[i] == chars[j]) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    private static boolean isAlNum(char character) {
        return Character.isAlphabetic(character) || Character.isDigit(character);
    }
}
