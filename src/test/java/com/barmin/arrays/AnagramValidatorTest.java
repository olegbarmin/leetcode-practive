package com.barmin.arrays;

import com.barmin.arrays.AnagramValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AnagramValidatorTest {


    @Test
    void test() {
        final var l = "anagram";
        final var r = "nagaram";

        Assertions.assertTrue(AnagramValidator.isAnagram(l, r));
    }

    @Test
    void test2() {
        final var l = "cat";
        final var r = "rat";

        Assertions.assertFalse(AnagramValidator.isAnagram(l, r));
    }

    @Test
    void test3() {
        final var l = "anagram";
        final var r = "nngaram";

        Assertions.assertFalse(AnagramValidator.isAnagram(l, r));
    }
}