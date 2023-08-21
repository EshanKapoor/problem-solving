/*
* Input
* 12541
*
* Output
* 4
*
* Input
* 98765
*
* Output
* 8
* */
package com.home.problems.numbers_and_bits;

import java.util.*;

class SumTillSingleDigit {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 10) {
            System.out.print(n);
            return;
        }

        int sum = 0;
        do {
            while(n > 0) {
                int m = n % 10;
                sum += m;
                n = n / 10;
            }
            n = sum;
            sum = 0;
        } while(n >= 10);

        System.out.print(n);
    }
}
