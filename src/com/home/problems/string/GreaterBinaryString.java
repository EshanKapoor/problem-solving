/*
* You are given a binary string of length N. Find the number of substrings of length K in which the number of zeroes are greater or equal to the number of ones.
Input
The first line of the input contains two integers N and K, the length of the binary string and the length of the substrings to test.
The second line of the input contains the binary string.

Constraints
1 <= K <= N <= 200000
Each character of the string is either 0 or 1.
Output
Output a single integer, the answer to the problem.
*
* Sample Input
5 3
01010

Sample Output
2

Explanation: The substrings of length 3 are "010", "101", "010". Of these, the first and the third ones satisfy the condition.

Sample Input
5 2
01010

Sample Output
4

Explanation: All the substrings of length 2 satisfy the condition.
* */
package com.home.problems.string;

import java.util.Scanner;

public class GreaterBinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        int j = 0;
        int sum = 0;
        for (j = 0; j < k; j++) {
            sum += arr[j];
        }
        int count = 0;
        if (sum <= (k / 2)) {
            count++;
        }

        for (j = k; j < n; j++) {
            sum = sum - arr[j - k] + arr[j];
            if (sum <= (k / 2)) {
                count++;
            }
        }
        System.out.println(count);
    }
}