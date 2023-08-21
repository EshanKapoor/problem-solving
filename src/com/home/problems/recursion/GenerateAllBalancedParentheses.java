package com.home.problems.recursion;

public class GenerateAllBalancedParentheses {
    public static void main(String[] args) {
        int n = 3;
        int open = n;
        int close = n;
        String output = "";
        solve(open, close, output);
    }


    private static void solve(int open, int close, String output) {
        if (open == 0 && close == 0) {
            System.out.print(output + " ");
            return;
        }

        if (open != 0) {
            solve(open - 1, close, output + "(");
        }

        if (close > open) {
            solve(open, close - 1, output + ")");
        }
    }
}
