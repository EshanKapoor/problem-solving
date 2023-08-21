package com.home.problems.array;

public class LeftRotateArrayNTimes {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int times = 7;
        printArray(arr);
        leftRotate(arr, times);
        printArray(arr);
    }

    private static void leftRotate(int[] arr, int times) {

    }

    private static void printArray(int[] arr) {
        for(int a: arr){
            System.out.print(a);
            System.out.print(" ");
        }
        System.out.println();
    }
}
