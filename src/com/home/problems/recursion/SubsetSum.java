package com.home.problems.recursion;

public class SubsetSum {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 3, 6};
        int sum = 100;
        System.out.println(subsetSum(sum, arr, arr.length));
    }

    private static int subsetSum(int target, int[] arr, int n) {
        if (n == 0) {
            if (target == 0)
                return 1;
            else
                return 0;
        }

        return subsetSum(target, arr, n - 1) +
                subsetSum(target - arr[n - 1], arr, n - 1);
    }
}
