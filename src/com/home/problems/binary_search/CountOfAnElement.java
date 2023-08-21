package com.home.problems.binary_search;

public class CountOfAnElement {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 10, 10, 10, 23, 33};
        int key = 23;
        System.out.println(count(arr, key));
    }

    private static int count(int[] arr, int key) {
        int firstOccurrence = FirstAndLastOccurrence.findFirstOccurrence(arr, key);
        int lastOccurrence = FirstAndLastOccurrence.findLastOccurrence(arr, key);
        if (firstOccurrence != -1 || lastOccurrence != -1) {
            return lastOccurrence - firstOccurrence + 1;
        }
        return 0;
    }
}
