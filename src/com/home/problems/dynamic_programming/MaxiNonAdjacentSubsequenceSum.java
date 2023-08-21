package com.home.problems.dynamic_programming;

import java.util.Arrays;
import java.util.List;

public class MaxiNonAdjacentSubsequenceSum {
    public static void main(String[] args) {
        int result = maximumNonAdjacentSum(Arrays.asList(1, 2, 4));
        System.out.println(result);
    }

    public static int maximumNonAdjacentSum(List<Integer> nums) {
        Integer[] dp = new Integer[nums.size() + 1];
        int result = solveRec(nums, nums.size() - 1, dp);
        System.out.print(Arrays.toString(dp));
        return result;
    }

    private static int solveRec(List<Integer> nums, int i, Integer[] dp) {
        if (i < 0)
            return 0;

        if (dp[i] != null)
            return dp[i];

        return dp[i] = Math.max(nums.get(i) + solveRec(nums, i - 2, dp),
                solveRec(nums, i - 1, dp));
    }
}
