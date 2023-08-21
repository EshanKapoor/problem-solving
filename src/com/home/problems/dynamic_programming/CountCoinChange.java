package com.home.problems.dynamic_programming;

public class CountCoinChange {
    public static void main(String[] args) {
        int[] coinArr = {2, 3, 4};
        int target = 8;
        Integer[][] dp = new Integer[coinArr.length + 1][target + 1];
        dp[0][0] = 1;
        int ans = countCoinChange(coinArr, coinArr.length, target, dp);
        System.out.println("Total no of ways to create " + target + " is " + ans);
        System.out.println("Total no of ways to create " + target + " is " + countCoinChangeTabulationMethod(coinArr, coinArr.length, target));
    }

    private static int countCoinChange(int[] coinArr, int n, int target, Integer[][] dp) {
        if (target == 0)
            return 1;

        if (n == 0)
            return 0;

        if (dp[n][target] != null)
            return dp[n][target];

        if (coinArr[n - 1] <= target) {
            return dp[n][target] = countCoinChange(coinArr, n, target - coinArr[n - 1], dp)
                    + countCoinChange(coinArr, n - 1, target, dp);
        }
        return dp[n][target] = countCoinChange(coinArr, n - 1, target, dp);
    }

    private static int countCoinChangeTabulationMethod(int[] coinArr, int n, int target) {
        Integer[][] dp = new Integer[n + 1][target + 1];

        for (int j = 1; j <= target; j++) {
            dp[0][j] = 0;
        }
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                if (coinArr[i - 1] <= j) {
                    dp[i][j] = dp[i][j - coinArr[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= target; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        return dp[n][target];
    }
}
