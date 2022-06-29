package com.barmin.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidParenthesesTest {

    @Test
    void test1(){
        final var input = "()";
        Assertions.assertTrue(ValidParentheses.isValid(input));
    }

    @Test
    void test2(){
        final var input = "()[]{}";
        Assertions.assertTrue(ValidParentheses.isValid(input));
    }


    @Test
    void test3(){
        final var input = "(]";
        Assertions.assertFalse(ValidParentheses.isValid(input));
    }

    @Test
    void test4(){
        final var input = "{[]}";
        Assertions.assertTrue(ValidParentheses.isValid(input));
    }
}