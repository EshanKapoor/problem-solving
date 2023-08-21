package com.home.problems.array;

public class PrefixArraySum {
    public static void main(String[] args) {
        int[] arr = {-1, 4, 0, 7, 2};

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
