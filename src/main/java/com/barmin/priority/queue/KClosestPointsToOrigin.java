package com.barmin.priority.queue;

import java.util.AbstractMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {

    public static int[][] kClosest(int[][] points, int k) {
        final var heap = new PriorityQueue<Map.Entry<int[], Double>>((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
        for (int[] point : points) {
            heap.add(new AbstractMap.SimpleEntry<>(point, distance(point)));
            trim(heap, k);
        }

        int[][] result = new int[heap.size()][];
        var iter = heap.iterator();
        for (int i = 0; i < result.length; i++) {
            result[i] = iter.next().getKey();
        }
        return result;
    }

    private static double distance(int[] point) {
        return Math.pow(point[0], 2) + Math.pow(point[1], 2);
    }


    private static void trim(PriorityQueue<Map.Entry<int[], Double>> heap, int k) {
        while (heap.size() > k) {
            heap.poll();
        }
    }
}
