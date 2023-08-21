package com.home.problems.sliding_window;

import java.util.Scanner;

public class MaxSubArraySumSizeK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        if (N < K) {
            throw new IllegalArgumentException("Array can't be smaller than 3");
        }

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nMax sub array sum is: " + getMax(arr, N, K));
    }

    public static int getMax(int[] arr, int N, int K) {
        int max = 0;
        for (int j = 0; j < K; j++) {
            max += arr[j];
        }

        int currentSum = max;
        for (int j = K; j < N; j++) {
            currentSum = currentSum + arr[j] - arr[j - K];
            max = max(max, currentSum);
        }
        return max;
    }

    private static int max(int a, int b) {
        return (a > b) ? a : b;
    }
}
