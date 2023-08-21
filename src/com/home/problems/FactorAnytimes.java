package com.home.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorAnytimes {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        long a = Long.parseLong(nums[0]);
        long b = Long.parseLong(nums[1]);

        System.out.println(a);
        System.out.println(b);

        long factor = factor(a);
        System.out.println(factor);
        if(factor == 1) {
            System.out.println("No");
            return;
        }

        long c = a + factor;
        while(c <= b) {
            if(c == b) {
                System.out.println("Yes");
                return;
            }
            factor = factor(c);
            c = c + factor;
        }
        System.out.println("No");
    }

    public static long factor(long a) {
        for(long i = 2; i * i <= a; i++)
        {
            if (a % i == 0) {
                System.out.println(i);
                return i;
            }
        }
        return 1;
    }
}
