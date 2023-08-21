package com.home.problems.string;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "naman";
        String s2 = "manan";

        if(s1.length() == s2.length()) {
            if(sortString(s1).equals(sortString(s2))) {
                System.out.println("Anagram");
                return;
            }
        }
        System.out.println("Not Anagram");
    }

    public static String sortString(String inputString)
    {
        // convert input string to char array
        char tempArray[] = inputString.toCharArray();

        // sort tempArray
        Arrays.sort(tempArray);

        // return new sorted string
        return new String(tempArray);
    }
}
