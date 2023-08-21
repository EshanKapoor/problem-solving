/**
 * Given a string S check if it is Pangram or not. A pangram is a sentence containing every letter in the English Alphabet.
 * Input
 * First line of input contains of an integer T denoting number od test cases then T test cases follow. Each testcase contains a String S.
 *
 * Constraints:
 * 1 <= T <= 100
 * 1 <= |S| <= 1000
 *
 * Note:- String will not contain any spaces
 * Output
 * For each test case print in a new line 1 if its a pangram else print 0.
 *
 * Input:
 * 2
 * Bawdsjogflickquartzvenymph
 * sdfs
 *
 * Output:
 * 0
 * 0
 *
 * Explanation :
 * Testcase 1: In the given input, the letter 'x' of the english alphabet is not present. Hence, the output is 0.
 * Testcase 2: In the given input, there aren't all the letters present in the english alphabet. Hence, the output is 0.
 */
package com.home.problems.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pangram {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine().toLowerCase();
            if (s.length() < 26) {
                System.out.println(0);
            } else {
                char[] arr = new char[26];
                for (int i = 0; i < s.length(); i++) {
                    arr[s.charAt(i) - 'a'] = s.charAt(i);
                }

                boolean isPangram = true;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == 0) {
                        System.out.println(0);
                        isPangram = false;
                        break;
                    }
                }

                if (isPangram) {
                    System.out.println(1);
                }
            }
        }
    }
}
