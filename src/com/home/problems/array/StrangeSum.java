/**
 * Remove duplicates in given arrays and then print the sum of common elements.
 *
 * Input
 * 5
 * 5
 * 3 5 3 5 8
 * 1 3 3 1 2
 *
 * Output
 * 3
 */
package com.home.problems.array;

import java.util.Arrays;
import java.util.Scanner;

class StrangeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        removeDuplicates(arr1, n1);
        removeDuplicates(arr2, n2);

        int i = 0, j = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j])
                i++;
            else if (arr2[j] < arr1[i])
                j++;
            else {
                sum += arr1[i++];
                j++;
            }
        }

        System.out.println(sum);

    }

    public static void removeDuplicates(int a[], int n) {
        if (n == 0 || n == 1) {
            return;
        }
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }

        temp[j++] = a[n - 1];

        for (int i = 0; i < n; i++) {
            if (i < j)
                a[i] = temp[i];
            else
                a[i] = 0;
        }
    }
}