/**
 * You are given N flags, initially set to 0. Now you have to perform two operations on them:
 *
 * 1. Increase(F) by 1: flag F is increased by 1.
 * 2. max_flag: all flags are set to maximum value of any flag.
 *
 * A non-empty array arr[] will be given of size M. This array represents consecutive operations:
 *
 * a) If arr[K] = F, such that 1 <= F <= N then operation K is Increase(F).
 * b) If arr[K] = N+1 then operation K is max_flag.
 *
 * For example, given integer N = 5 and array arr of size 7 such that:
 * arr[0] = 3
 * arr[1] = 4
 * arr[2] = 4
 * arr[3] = 6
 * arr[4] = 1
 * arr[5] = 4
 * arr[6] = 4
 *
 * the values of the flags after each consecutive operation will be:
 * (0, 0, 1, 0, 0)
 * (0, 0, 1, 1, 0)
 * (0, 0, 1, 2, 0)
 * (2, 2, 2, 2, 2)
 * (3, 2, 2, 2, 2)
 * (3, 2, 2, 3, 2)
 * (3, 2, 2, 4, 2)
 *
 * The goal is to calculate the value of every flags after all operations.
 * Input
 * The input line contains T, denoting the number of testcases.
 * Each testcase contains two lines.
 * First line contains an integer N, the number of flags and an integer M, size of array 'arr'. S
 * econd line contains elements of array 'arr' separated by space.
 *
 * Constraints:
 * 1 <= T <= 100
 * 1 <= N, M <= 10^5
 * 1 <= arr[i] <= N+1
 *
 * Sum of N and M for each test case is less than or equal to 10^5
 * Output
 * For each testcase you need to print the updated array after all operations in new line.
 *
 */
package com.home.problems.array;

import java.util.Scanner;

class MaxFlags {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] flags = new int[N + 1];

            int M = sc.nextInt();
            int[] arr = new int[M];
            for (int i = 0; i < M; i++) {
                arr[i] = sc.nextInt();
            }

            int max = 0;
            for (int k = 0; k < M; k++) {
                int F = arr[k];
                if (F == N + 1) {
                    maxFlag(flags, max, N);
                } else if (F >= 1 && F <= N) {
                    flags[F] = flags[F] + 1;
                    max = getMax(max, flags[F]);
                }
            }

            for (int i = 1; i <= N; i++) {
                System.out.print(flags[i] + " ");
            }
            System.out.println();
        }
    }

    public static void maxFlag(int[] flags, int max, int N) {
        for (int i = 1; i <= N; i++) {
            flags[i] = max;
        }
    }

    public static int getMax(int a, int b) {
        return a > b ? a : b;
    }
}
