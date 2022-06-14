package com.barmin.backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        final var result = new ArrayList<List<Integer>>();
        dfs(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    public static void dfs(int[] nums, int target, int i, List<Integer> cur, List<List<Integer>> result) {
        int sum = cur.stream().mapToInt(Integer::intValue).sum();
        if (sum > target) return;
        if (i == nums.length) return;
        if (sum == target) {
            result.add(cur);
            return;
        }

        cur.add(nums[i]);
        dfs(nums, target, i, new ArrayList<>(cur), result);

        cur.remove(cur.size() - 1);
        dfs(nums, target, ++i, new ArrayList<>(cur), result);
    }
}
