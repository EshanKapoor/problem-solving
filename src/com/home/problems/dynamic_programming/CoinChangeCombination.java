package com.home.problems.dynamic_programming;

public class CoinChangeCombination {
    public static void main(String[] args) {
        int[] coinArr = {1, 2, 3};
        int target = 4;
        System.out.println(countCoinChange(coinArr, coinArr.length, target));
    }

    private static int countCoinChange(int[] coinArr, int n, int target) {
        if (target == 0)
            return 1;

        if (n == 0)
            return 0;

        int result = 0;
        if (coinArr[n - 1] <= target) {
            result += countCoinChange(coinArr, n, target - coinArr[n - 1]) +
                    countCoinChange(coinArr, n - 1, target);
        } else {
            result += countCoinChange(coinArr, n - 1, target);
        }
        return result;
    }
}
