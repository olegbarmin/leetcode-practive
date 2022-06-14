package com.barmin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SingleDirectionalListTest {

    @Test
    void test() {
        final var list = new SingleDirectionalList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Assertions.assertEquals(List.of(5, 4, 3, 2, 1), list.reverse());
    }
}