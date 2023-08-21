/**
 * Problem Statement
 * Given an array A of size n, and an integer k. Find the maximum force by involving only k elements. The Force of an element is the square of its value.
 *
 * Note:
 * Elements are not needed to be continuous.
 * Input
 * The first line of the input contains two integers denoting n and k.
 * The next line contains n integers denoting elements of the array.
 *
 * Constraints:
 * 1 < = k < = n < = 1000
 * -10^7 <= A[i] <= 10^7
 * Output
 * Output the maximum force.
 */
package com.home.problems.array;

import java.util.Arrays;
import java.util.Scanner;

public class Force {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (n != k) {
            Arrays.sort(arr);
        }

        long force = 0l;
        for (int i = n - 1; i >= n - k; i--) {
            force = force + ((long) arr[i] * arr[i]);
        }
        System.out.println(force);
    }
}
