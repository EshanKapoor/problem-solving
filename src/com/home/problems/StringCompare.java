package com.home.problems;

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        StringBuilder str = new StringBuilder(sc.next());
        int j = 0;
        int swapInd = 0;
        while (j < str.length() - 1 && k > 0) {
            if (str.charAt(j) == '1' && str.charAt(j + 1) == '1') {
                j++;
            } else if (str.charAt(j) == '1' && str.charAt(j + 1) == '0') {
                int strInd = j + 1;
                if (k >= j) {
                    swap(str, swapInd, strInd);
                    k = k - (strInd - swapInd);
                    swapInd++;
                    j++;
                } else {
                    swap(str, strInd, strInd - (int) k);
                    k = 0;
                }
            } else {
                swapInd++;
                j++;
            }
        }
        System.out.print(str);
    }

    public static void swap(StringBuilder str, int ind1, int ind2) {
        char temp = str.charAt(ind1);
        str.setCharAt(ind1, str.charAt(ind2));
        str.setCharAt(ind2, temp);
    }
}