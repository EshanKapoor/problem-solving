package com.home.problems.recursion;

import java.util.Scanner;

public class PrintSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String output = "";
        solve(input, output);
    }

    private static void solve(String input, String output) {
        if(input.isEmpty()) {
            System.out.print(output + " ");
            return;
        }

        String output2 = output + input.charAt(0);
        input = input.substring(1);
        solve(input, output);
        solve(input, output2);
    }
}
