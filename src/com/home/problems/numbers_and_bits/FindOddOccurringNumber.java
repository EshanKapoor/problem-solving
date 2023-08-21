package com.home.problems.numbers_and_bits;

public class FindOddOccurringNumber {
    public static void main(String[] args) {
        int[] arr = {4,4,3,4,5,4,5,5,5,3,3};
        int result = 0;
        for(int i : arr) {
            result ^= i;
        }
        System.out.println(result);
    }
}
