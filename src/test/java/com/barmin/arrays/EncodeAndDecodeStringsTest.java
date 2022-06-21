package com.barmin.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class EncodeAndDecodeStringsTest {

    private final EncodeAndDecodeStrings encoder = new EncodeAndDecodeStrings();

    @Test
    void test1() {
        final var input = List.of("lint", "code", "love", "you");

        final var encode = encoder.encode(input);
        final var decoded = encoder.decode(encode);

        Assertions.assertEquals(input, decoded);
    }
}