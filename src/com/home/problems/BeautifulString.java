package com.home.problems;

import java.util.Scanner;

public class BeautifulString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(isBeautifulString(input));
    }

    public static boolean isBeautifulString(String input) {
        int[] arr = new int[26];

        for (int i = 0; i < input.length(); i++) {
            int pos = input.charAt(i) - 97;
            arr[pos] = ++arr[pos];
        }

        int prevCharCount = -1;
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                continue;
            }
            prevCharCount = arr[i];
            break;
        }

        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] == 0) {
                continue;
            } else if (arr[j] > prevCharCount) {
                return false;
            } else {
                prevCharCount = arr[j];
            }
        }
        return true;
    }
}
