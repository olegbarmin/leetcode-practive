package com.barmin.arrays;

import java.util.*;

/**
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 * <p>
 * You must write an algorithm that runs in O(n) time.
 *
 * @leetcode 128
 * @complexity O(n)
 * @memory O(n)
 */
public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        final var set = new HashSet<Integer>();
        for (int num : nums) {
            set.add(num);
        }

        var max = 0;
        for (int num : nums) {
            if (!set.contains(num - 1)) { // start of the sequence
                set.remove(num);

                int currentSequence = 1;
                var cur = num + 1;
                while (set.contains(cur)) {
                    set.remove(cur);
                    currentSequence++;
                    cur++;
                }
                max = Math.max(max, currentSequence);
            }
        }

        return max;
    }
}
