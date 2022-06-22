package com.barmin.two.pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidPalindromeTest {

    @Test
    void test1() {
        final var input = "A man, a plan, a canal: Panama";

        Assertions.assertTrue(ValidPalindrome.isPalindrome(input));
    }

    @Test
    void test2() {
        final var input = "race a car";

        Assertions.assertFalse(ValidPalindrome.isPalindrome(input));
    }

    @Test
    void test3() {
        final var input = " ";

        Assertions.assertTrue(ValidPalindrome.isPalindrome(input));
    }

    @Test
    void test4() {
        final var input = "not a palindrome";

        Assertions.assertFalse(ValidPalindrome.isPalindrome(input));
    }

    @Test
    void test5() {
        final var input = "0P";

        Assertions.assertFalse(ValidPalindrome.isPalindrome(input));
    }

    @Test
    void test6() {
        final var input = "aa";

        Assertions.assertTrue(ValidPalindrome.isPalindrome(input));
    }
}