package com.home.problems.sorting;

import java.util.Scanner;

public class RunQuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        QuickSort.sort(arr, 0, arr.length - 1);

        System.out.println("\nArray after sorting");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
