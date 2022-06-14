package com.barmin;

import java.util.Arrays;
import java.util.Random;

public class Spotify {

    private final int[] songs;

    public Spotify(int[] nums) {
        songs = nums;
    }

    public int[] reset() {
        return songs;
    }

    public int[] shuffle() {
        final var result = new int[songs.length];

        int bound = songs.length - 1;
        int[] songs = Arrays.copyOf(this.songs, this.songs.length);
        for (int i = 0; i < result.length; i++, bound--) {
            int r = random(bound);
            result[i] = songs[r];
            swap(r, bound, songs);
        }

        return result;
    }

    private void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int random(int n) {
        Random random = new Random();
        return random.nextInt(0, n + 1);
    }
}
