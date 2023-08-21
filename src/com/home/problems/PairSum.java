package com.home.problems;

import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        while (q-- > 0) {
            int sum = 0;
            int l = sc.nextInt();
            l--;
            int r = sc.nextInt();
            r--;
            for (int i = 0; i < n; i++) {
                if (i >= l && i <= r)
                    continue;
                else
                    sum += arr[i];
            }
            System.out.println(sum);
        }
    }
}
