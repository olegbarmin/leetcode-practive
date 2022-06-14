package com.barmin.arrays;

import com.barmin.arrays.FindDuplicates;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindDuplicatesTest {

    @Test
    void findDuplicatesTrue() {
        final var input = new int[]{1, 2, 3, 1};

        assertTrue(FindDuplicates.containsDuplicate(input));
    }

    @Test
    void findDuplicatesFalse() {
        final var input = new int[]{1, 2, 3, 4};

        assertFalse(FindDuplicates.containsDuplicate(input));
    }

    @Test
    void findDuplicatesTrueLongInput() {
        final var input = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        assertTrue(FindDuplicates.containsDuplicate(input));
    }
}