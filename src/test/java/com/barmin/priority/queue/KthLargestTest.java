package com.barmin.priority.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KthLargestTest {

    @Test
    void test1() {
        KthLargest kthLargest = new KthLargest(3, new int[]{4, 5, 8, 2});
        Assertions.assertEquals(4, kthLargest.add(3));
        Assertions.assertEquals(5, kthLargest.add(5));
        Assertions.assertEquals(5, kthLargest.add(10));
        Assertions.assertEquals(8, kthLargest.add(9));
        Assertions.assertEquals(8, kthLargest.add(4));
    }

}