package com.barmin;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SpotifyTest {

    @Test
    void test() {
        int[] songs = {1, 2, 3};
        Spotify spotify = new Spotify(songs);
        int[] result = spotify.shuffle();
        System.out.println(Arrays.toString(result));
    }
}