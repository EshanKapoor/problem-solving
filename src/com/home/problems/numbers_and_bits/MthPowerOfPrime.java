/**
 * Problem Statement
 * Andrew loves to solve problems related to prime numbers. One of Andrew's friend has asked him to solve below problem for him.
 * Given two positive integers N and M, the task is to check that N is the Mth power of a prime number or not.
 * Input
 * First line of input contains testcases T. For each testcase, there will be two positive integers N and M.
 *
 * Constraints :
 * 1 <= T <= 100
 * 2 <= N <= 10^6
 * 1 <= M <= 10
 * Output
 * For each testcase you need to print "Yes" if N is the Mth power of a prime number otherrwise "No".
 */
package com.home.problems.numbers_and_bits;

import java.util.Scanner;

public class MthPowerOfPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            boolean flag = false;
            int[] primes = getPrimesArr_BySieveOfEratosthenes(n);
            for (int j = 2; j < primes.length; j++) {
                if (primes[j] == 1 && (long) Math.pow(j, m) == n) {
                    flag = true;
                    break;
                }
            }

            if (flag)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }

    public static int[] getPrimesArr_BySieveOfEratosthenes(int n) {
        int[] arr = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            arr[i] = 1;
        }

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (arr[i] == 1) {
                for (int j = 2; i * j <= n; j++) {
                    arr[i * j] = 0;
                }
            }
        }
        return arr;
    }
}
