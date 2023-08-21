package com.home.problems.numbers_and_bits;

public class PrintDivisors {
    public static void printDivisors(long n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if(Math.sqrt(n) != i)
                    System.out.print(n / i + " ");
            }
        }

       /* for (int i = (int) Math.sqrt(n); i >= 1; i--) {
            if (n % i == 0)
                System.out.print(n / i + " ");
        }*/
    }

    public static void main(String[] args) {
        printDivisors(25);
    }
}
