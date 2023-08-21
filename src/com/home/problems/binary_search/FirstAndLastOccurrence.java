package com.home.problems.binary_search;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 10, 10, 10, 23, 33};
        int key = 92;
        int first = findFirstOccurrence(arr, key);
        int last = findLastOccurrence(arr, key);
        System.out.println(first + "," + last);
    }

    public static int findFirstOccurrence(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                result = mid;
                high = mid - 1;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    public static int findLastOccurrence(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                result = mid;
                low = mid + 1;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }
}
