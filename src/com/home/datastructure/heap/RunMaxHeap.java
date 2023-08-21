package com.home.datastructure.heap;

import java.util.Arrays;

public class RunMaxHeap {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        MaxHeap.heapify(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
