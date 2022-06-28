package com.barmin.two.pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumWindowSubstringTest {

    @Test
    void test1() {
        final var s = "ADOBECODEBANC";
        final var t = "ABC";

        final var expected = "BANC";
        Assertions.assertEquals(expected, MinimumWindowSubstring.minWindow(s, t));
    }

    @Test
    void test2() {
        final var s = "a";
        final var t = "a";

        final var expected = "a";
        Assertions.assertEquals(expected, MinimumWindowSubstring.minWindow(s, t));
    }

    @Test
    void test3() {
        final var s = "a";
        final var t = "aa";

        final var expected = "";
        Assertions.assertEquals(expected, MinimumWindowSubstring.minWindow(s, t));
    }

    @Test
    void test4() {
        final var s = "ab";
        final var t = "b";

        final var expected = "b";
        Assertions.assertEquals(expected, MinimumWindowSubstring.minWindow(s, t));
    }

    @Test
    void test5() {
        final var s = "aa";
        final var t = "aaa";

        final var expected = "";
        Assertions.assertEquals(expected, MinimumWindowSubstring.minWindow(s, t));
    }
}