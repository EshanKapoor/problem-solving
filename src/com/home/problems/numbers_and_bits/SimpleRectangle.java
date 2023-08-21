/**
 * Given N coordinates on a two-dimensional plane. Find the area of the smallest rectangle such that all the points can lie inside or on the rectangle boundary.
 * Note - the sides of rectangle should be parallel to x and y axis.
 * Input
 * First line of input contains N.
 * Next N lines contains two integers x[i] and y[i].
 *
 * Constraints:
 * 2 <= N <= 100000
 * 0 <= x[i], y[i] <= 1000000000
 *
 * Note the required rectangle will never have 0 area.
 * Output
 * Print the area of the smallest rectangle such that all the points can lie inside or on the rectangle the boundary.
 *
 * Sample Input
 * 2
 * 0 0
 * 1 1
 *
 * Sample Output
 * 1
 *
 * Explanation: required rectangle has corners at (0, 0) (0, 1) (1, 1) (1, 0)
 */
package com.home.problems.numbers_and_bits;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] x = new long[n];
        long[] y = new long[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        Arrays.sort(x);
        Arrays.sort(y);

        System.out.println(Math.abs(x[n-1] - x[0]) * Math.abs(y[n-1] - y[0]));
    }
}
