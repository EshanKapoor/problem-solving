package com.home.problems;

import java.util.Arrays;
import java.util.Scanner;

class PrintRepeatedInSortingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int[] arr2 = new int[n];
            Arrays.sort(arr);

            int k =0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        arr[k] = arr[i];
                    } else {
                        k++;
                    }
                }
            }

            for(int i=0; i<n; i++) {
                if(arr2[i] > 0) {
                    System.out.print(arr2[i] + " ");
                }
            }

        }
    }
}