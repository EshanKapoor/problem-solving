package com.home.problems.recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(toh(n, 'A', 'B', 'C'));
    }

    public static int toh(int n, char from, char aux, char to) {
        int count = 0;
        if (n == 1) {
            System.out.println(String.format("Move Disc %d from %s to %s", n, from, to));
            return 1;
        }

        count += toh(n - 1, from, to, aux);
        System.out.println(String.format("Move Disc %d from %s to %s", n, from, to));
        count++;
        count += toh(n - 1, aux, from, to);
        return count;
    }
}
