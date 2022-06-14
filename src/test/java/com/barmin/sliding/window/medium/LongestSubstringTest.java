package com.barmin.sliding.window.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestSubstringTest {

    @Test
    void test1() {
        final var input = "abcabcbb";
        Assertions.assertEquals(3, LongestSubstring.lengthOfLongestSubstring(input));
    }

    @Test
    void test2() {
        final var input = "bbbbb";
        Assertions.assertEquals(1, LongestSubstring.lengthOfLongestSubstring(input));
    }

    @Test
    void test3() {
        final var input = "pwwkew";
        Assertions.assertEquals(3, LongestSubstring.lengthOfLongestSubstring(input));
    }

    @Test
    void test4() {
        final var input = "dabcdbcbb";
        Assertions.assertEquals(4, LongestSubstring.lengthOfLongestSubstring(input));
    }
}