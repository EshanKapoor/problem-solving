package com.home.problems.dynamic_programming;

public class SubsetSum {

    public static void main(String[] args) {
        int[] arr = {2, 7, 5, 9, 4, 1};
        //int[] arr = {4, 3};
        int n = arr.length;
        int sum = 12;

        ///Boolean[][] dp = new Boolean[n + 1][sum + 1];
        //System.out.println(isSubsetSum(arr, n, sum, dp));

        /*for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }*/

        System.out.println(isSubsetSumBottomUp(arr, n, sum));
        System.out.println(countSubsetSumBottomUp(arr, n, sum));
    }

    private static Boolean isSubsetSum(int[] arr, int n, int targetSum, Boolean[][] dp) {
        if (targetSum == 0)
            return true;

        if (n == 0 || targetSum < 0)
            return false;

        if (dp[n][targetSum] != null)
            return dp[n][targetSum];

        if (arr[n - 1] <= targetSum) {
            return dp[n][targetSum] = isSubsetSum(arr, n - 1, targetSum - arr[n - 1], dp)
                    || isSubsetSum(arr, n - 1, targetSum, dp);
        }
        return dp[n][targetSum] = isSubsetSum(arr, n - 1, targetSum, dp);
    }

    private static Boolean isSubsetSumBottomUp(int[] arr, int n, int targetSum) {
        Boolean[][] dp = new Boolean[n + 1][targetSum + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        for (int j = 1; j <= targetSum; j++) {
            dp[0][j] = false;
        }


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= targetSum; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - arr[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= targetSum; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        return dp[n][targetSum];
    }

    private static int countSubsetSumBottomUp(int[] arr, int n, int targetSum) {
        Integer[][] dp = new Integer[n + 1][targetSum + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        for (int j = 1; j <= targetSum; j++) {
            dp[0][j] = 0;
        }


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= targetSum; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - arr[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= targetSum; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        return dp[n][targetSum];
    }
}
