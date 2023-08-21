package com.home.datastructure.heap;

public class MaxHeap {
    public static void heapify(int[] arr) {
        int lastParentIndex = arr.length / 2 - 1;
        for (int i = lastParentIndex; i >= 0; i--) {
            heapifyy(arr, i);
        }
    }

    private static void heapify(int[] arr, int index) {
        int largerIndex = index;

        int leftIndex = index * 2 + 1;
        if (leftIndex < arr.length && arr[leftIndex] > arr[largerIndex]) {
            largerIndex = leftIndex;
        }

        int rightIndex = index * 2 + 2;
        if (rightIndex < arr.length && arr[rightIndex] > arr[largerIndex]) {
            largerIndex = rightIndex;
        }

        if (largerIndex == index)
            return;

        swap(arr, index, largerIndex);
        heapify(arr, largerIndex);
    }

    private static void heapifyy(int[] arr, int index) {
        int leftChildIndex = index * 2 + 1;
        int rightChildIndex = index * 2 + 2;
        while (leftChildIndex < arr.length) {
            int largerChildIndex = leftChildIndex;
            if (rightChildIndex < arr.length && arr[rightChildIndex] > arr[leftChildIndex]) {
                largerChildIndex = rightChildIndex;
            }

            if (arr[index] > arr[largerChildIndex]) {
                break;
            } else {
                swap(arr, index, largerChildIndex);
                index = largerChildIndex;
            }
        }
    }

    private static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
