package com.barmin;

/**
 * Design a hit counter which counts the number of hits received in the past 5 minutes.
 */
public class HitCounter {

    private static final int TIME_FRAME = 5 * 60;
    private int[] timestamps = new int[TIME_FRAME];
    private int[] hits = new int[TIME_FRAME];


    public void hit(int timestamp) {
        int index = timestamp % TIME_FRAME;
        if (timestamps[index] == timestamp) {
            timestamps[index] = timestamp;
            hits[index]++;
        } else {
            timestamps[index] = timestamp;
            hits[index] = 1;
        }
    }

    int getHits(long currentTime) {
        var result = 0;
        for (int i = 0; i < timestamps.length; i++) {
            var timestamp = timestamps[i];
            if(currentTime - timestamp < 300) {
                result += hits[i];
            }
        }
        return result;
    }
}
