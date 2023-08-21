package com.home.problems.array;

import java.util.Arrays;

public class Segregate0sand1s {
    public static void main(String[] args) {
        int n = 8;
        int[] arr = {1, 1, 0, 0, 0, 0, 1, 0};
        segregate0and1(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    private static void segregate0and1(int[] arr, int n) {
        int low = 0;
        int high = n - 1;
        while (low < high) {
            if (arr[low] == 0)
                low++;
            else if (arr[high] == 1)
                high--;
            else {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
    }
}
