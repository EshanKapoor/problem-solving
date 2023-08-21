package com.home.problems.dynamic_programming;

public class MinCoinChange {
    public static void main(String[] args) {
        int[] coinArr = {1, 2, 3};
        int target = 5;
        int ans = minCoinChange(coinArr, target);
        System.out.println("Minimum coins required for " + target + " is " + ans);

        Integer[] dp = new Integer[target + 1];
        dp[0] = 0;
        ans = minCoinChangeMemoization(coinArr, target, dp);
        System.out.println("Minimum coins required for " + target + " is " + ans);
    }

    private static int minCoinChange(int[] coinArr, int target) {
        if (target == 0)
            return 0;

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < coinArr.length; i++) {
            if (target >= coinArr[i]) {
                int subAns = minCoinChange(coinArr, target - coinArr[i]);
                if (subAns != Integer.MAX_VALUE) {
                    ans = Math.min(ans, subAns + 1);
                }
            }
        }
        return ans;
    }

    private static int minCoinChangeMemoization(int[] coinArr, int target, Integer[] dp) {
        if (target == 0)
            return 0;

        if (dp[target] != null)
            return dp[target];

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < coinArr.length; i++) {
            if (target >= coinArr[i]) {
                int subAns = minCoinChange(coinArr, target - coinArr[i]);
                if (subAns != Integer.MAX_VALUE) {
                    ans = Math.min(ans, subAns + 1);
                }
            }
        }
        dp[target] = ans;
        return ans;
    }
}
