package com.home.problems.numbers_and_bits;

public class IsPowerOfTwo {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(n > 0 && ((n & (n-1)) == 0));
    }
}
