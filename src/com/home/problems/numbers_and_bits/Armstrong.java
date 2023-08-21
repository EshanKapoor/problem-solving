package com.home.problems.numbers_and_bits;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int sum = 0;
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 1; i <= N; i++) {
            sum = 0;
            int n = i;
            while (n > 0) {
                int rem = n % 10;
                sum = sum + (rem * rem * rem);
                n = n / 10;
            }
            if (i == sum) {
                System.out.print(sum+" ");
            }
        }
    }
}
