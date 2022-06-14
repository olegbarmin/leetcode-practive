package com.barmin.two.pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeValidatorTest {

    @Test
    void test1() {
        final var input = "A man, a plan, a canal: Panama";

        Assertions.assertTrue(PalindromeValidator.isPalindrome(input));
    }


    @Test
    void test2() {
        final var input = "race a car";

        Assertions.assertFalse(PalindromeValidator.isPalindrome(input));
    }

    @Test
    void test3() {
        final var input = " ";

        Assertions.assertTrue(PalindromeValidator.isPalindrome(input));
    }

    @Test
    void test4() {
        final var input = "not a palindrome";

        Assertions.assertFalse(PalindromeValidator.isPalindrome(input));
    }
}