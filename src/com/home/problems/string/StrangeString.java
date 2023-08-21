/**
 * The question is super small and super simple.
 * You are given an integer n. Initially you have an empty string. You need to construct the string of length n with the following rules:
 * 1. Insert the first character in the beginning of string, the second in the end, the third in the beginning, fourth in the end, and so on.
 * 2. The first character should be 'a', followed by 'b', 'c', and so on. 'z' will be followed by 'a'.
 * Input
 * The first and the only line of input contains a single number n.
 *
 * Constraints
 * 1 <= n <= 500000
 * Output
 * Output the generated string.
 *
 * Sample Input
 * 4
 *
 * Sample Output
 * cabd
 *
 * Sample Input
 * 30
 *
 * Sample Output
 * caywusqomkigecabdfhjlnprtvxzbd
 *
 * Explanation
 * In the first case the string transforms as follows: "" -> "a" -> "ab" -> "cab" -> "cabd"
 *
 *
 * */
package com.home.problems.string;

import java.util.*;

public class StrangeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        char start;
        if(n==1) {
            System.out.print('a');
        } else {
            StringBuilder s = new StringBuilder("");
            for (i = 1, start = 'a'; i <= n; i++, start++) {
                if (i % 26 == 0) {
                    s.insert(s.length(), start);
                    start = 96;
                } else {
                    if (i % 2 != 0) {
                        s.insert(0, start);
                    } else {
                        s.insert(s.length(), start);
                    }
                }
            }
            System.out.println(s);
        }
    }
}