package com.barmin.sliding.window.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestRepeatingCharacterReplacementTest {

    @Test
    void test1() {
        var s = "ABAB";
        var k = 2;
        Assertions.assertEquals(4, LongestRepeatingCharacterReplacement.characterReplacement(s, k));
    }

    @Test
    void test2() {
        var s = "AABABBA";
        var k = 1;
        Assertions.assertEquals(4, LongestRepeatingCharacterReplacement.characterReplacement(s, k));
    }

    @Test
    void test3() {
        var s = "ABAA";
        var k = 0;
        Assertions.assertEquals(2, LongestRepeatingCharacterReplacement.characterReplacement(s, k));
    }
}