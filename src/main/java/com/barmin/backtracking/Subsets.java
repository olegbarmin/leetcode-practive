package com.barmin.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public static List<List<Integer>> subsets(int[] nums) {
        var result = new ArrayList<List<Integer>>();
        dfs(nums, 0, result, new ArrayList<>());
        return result;
    }

    private static List<Integer> dfs(int[] nums, int i, List<List<Integer>> result, List<Integer> subset) {
        if (i == nums.length) {
            result.add(subset);
            return subset;
        }

        subset.add(nums[i]);
        dfs(nums, i + 1, result, new ArrayList<>(subset));

        subset.remove(subset.size() - 1);
        dfs(nums, i + 1, result, new ArrayList<>(subset));

        return subset;
    }
}
