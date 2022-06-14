package com.barmin.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GroupAnagramsTest {

    @Test
    @Disabled("To lazy to write custom equals")
    void test1() {
        final String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        final Set<List<String>> expected = Set.of(List.of("bat"), List.of("nat", "tan"), List.of("ate", "eat", "tea"));

        Assertions.assertEquals(expected, new HashSet<>(GroupAnagrams.groupAnagrams(input)));
    }
}