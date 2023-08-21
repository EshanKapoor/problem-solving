/**
 * Given a number N. The task is to generate and print all binary numbers with decimal values from 1 to N.
 *
 * Try solving this using a queue.
 * Input
 * The only line of input contains a single integer N.
 *
 * 1 <= N <= 50000
 * Output
 * Print all binary numbers with decimal values from 1 to N in a single line.
 *
 * Sample Input:
 * 5
 *
 * Sample Output:
 * 1 10 11 100 101
 */
package com.home.problems.queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class QueueBinaryRepresentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<String> q = new ArrayDeque<>();
        q.add("1");
        while(n-- > 0) {
            String s = q.remove();
            System.out.print(s + " ");

            q.add(s + "0");
            q.add(s + "1");
        }
    }
}
