package com.barmin.priority.queue;

import java.util.PriorityQueue;

public class KthLargest {

    private final PriorityQueue<Integer> heap = new PriorityQueue<>();
    private final int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (int num : nums) {
            heap.add(num);
        }
        trim();
    }

    public Integer add(int val) {
        heap.add(val);
        trim();
        return heap.peek();
    }

    private void trim() {
        while (heap.size() > k) {
            heap.poll();
        }
    }
}