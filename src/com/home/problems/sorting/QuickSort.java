package com.home.problems.sorting;

public class QuickSort {
    public static void sort(int[] arr, int start, int end) {
        if (start < end) {
            int partitionIndex = partition(arr, start, end);
            sort(arr, start, partitionIndex - 1);
            sort(arr, partitionIndex + 1, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int pivotIndex = start;
        int i = start;
        while (i < end) {
            if (arr[i] < pivot) {
                swap(arr, i, pivotIndex);
                pivotIndex++;
            }
            i++;
        }
        swap(arr, i, pivotIndex);
        printArray(arr);
        return pivotIndex;
    }

    private static void printArray(int[] arr) {
        System.out.println();
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
