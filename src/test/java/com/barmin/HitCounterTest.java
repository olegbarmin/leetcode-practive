package com.barmin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HitCounterTest {


    @Test
    void test1() {
        HitCounter hitCounter = new HitCounter();

        hitCounter.hit(1);
        hitCounter.hit(2);
        hitCounter.hit(5);
        Assertions.assertEquals(3, hitCounter.getHits(50));
        Assertions.assertEquals(0, hitCounter.getHits(350));

        hitCounter.hit(303);
        Assertions.assertEquals(2, hitCounter.getHits(304));
    }
}