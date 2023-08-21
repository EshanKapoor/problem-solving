/**
 * Find first repeating/non-repeating character in a given string. Consider all characters from ACSII table starting from SPACE to ~.
 * This solution doesn't use java collection library.
 */
package com.home.problems.string;

import java.util.Scanner;

public class FindCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] countArr = new int[95];
        findEachCharacterCount(input, countArr);
        System.out.println(findFirstNonRepeatingCharacter(input, countArr));
        System.out.println(findFirstRepeatingCharacter(input, countArr));
    }

    private static void findEachCharacterCount(String input, int[] countArr) {
        for (int i = 0; i < input.length(); i++) {
            int pos = input.charAt(i) - 32;
            countArr[pos]++;
        }
    }

    private static char findFirstNonRepeatingCharacter(String input, int[] countArr) {
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int count = countArr[ch - 32];
            if (count == 1)
                return ch;
        }
        return Character.MIN_VALUE;
    }

    private static char findFirstRepeatingCharacter(String input, int[] countArr) {
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int count = countArr[ch - 32];
            if (count > 1)
                return ch;
        }
        return Character.MIN_VALUE;
    }
}
