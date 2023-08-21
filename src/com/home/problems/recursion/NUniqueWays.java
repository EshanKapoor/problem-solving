/*
* Find number of ways an integer N can be represented as a sum of unique natural numbers.
Input
First line contain an integer T denoting number of test cases. Each test case contains a single integer N.

Constraint:-
1 <= T <= 100
0 <= N <= 120
Output
Print all the ways.
*
*
* Sample input
2
6
10

Sample output:-
[1, 2, 3]
[1, 5]
[2, 4]
[6]

[1, 2, 3, 4]
[1, 2, 7]
[1, 3, 6]
[1, 4, 5]
[1, 9]
[2, 3, 5]
[2, 8]
[3, 7]
[4, 6]
[10]

Explanation:-
TestCase1:-
6 can be represented as (1, 2, 3), (1, 5), (2, 4), (6)
*
* */
package com.home.problems.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NUniqueWays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            List<Integer> list = new ArrayList<>();
            int n = sc.nextInt();
            numOfWays(1, n, list);
        }
    }

    public static void numOfWays(int j, int n, List<Integer> list) {
        if (n == 0) {
            System.out.println(list);
        }

        for (int i = j; i <= n; i++) {
            list.add(i);
            numOfWays(i + 1, n - i, list);
            list.remove(list.size() - 1);
        }
    }
}
