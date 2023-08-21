package com.home.problems;

import java.util.Scanner;

public class LuckyBoys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] dSizes = new int[n];
        for (int i = 0; i < n; i++) {
            dSizes[i] = sc.nextInt();
        }

        int[] tSizes = new int[m];
        for (int i = 0; i < m; i++) {
            tSizes[i] = sc.nextInt();
        }

        int p = 0;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = p; j < n; j++) {
                if (Math.abs(tSizes[i]-dSizes[j]) <= k) {
                    swap(dSizes, j, p);
                    count++;
                    p++;
                    break;
                }
            }
        }

        System.out.print(count);
    }

    public static void swap(int[] dSizes, int a, int b) {
        int temp = dSizes[a];
        dSizes[a] = dSizes[b];
        dSizes[b] = temp;
    }
}
