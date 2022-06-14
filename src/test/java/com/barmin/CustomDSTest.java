package com.barmin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CustomDSTest {


    @Test
    void test() {
        var ds = new CustomDS(10);
        Assertions.assertEquals(0, ds.get(0));
        ds.set(0, 1);
        Assertions.assertEquals(1, ds.get(0));

        ds.setAll(100);

        Assertions.assertEquals(100, ds.get(0));

        ds.set(0, 1);
        Assertions.assertEquals(1, ds.get(0));
    }

}