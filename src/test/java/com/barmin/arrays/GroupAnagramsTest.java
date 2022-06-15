package com.barmin.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class GroupAnagramsTest {

    @Test
    void test1() {
        final String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        final Set<Set<String>> expected = Set.of(Set.of("bat"), Set.of("nat", "tan"), Set.of("ate", "eat", "tea"));

        final var actual = GroupAnagrams.groupAnagrams(input)
                        .stream().map(HashSet::new)
                        .collect(Collectors.toSet());
        Assertions.assertEquals(expected, actual);
    }
}