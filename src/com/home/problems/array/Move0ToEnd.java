package com.home.problems.array;

import java.util.Arrays;
//this also works for 1 and 0 if asked to move all zero to end

//Order should be preserved. 11, 12, 1... 0, 0, 0 is correct.    11, 1, 12 ... 0, 0, 0 is incorrect
public class Move0ToEnd {
    public static void main(String[] args) {
        int[] arr = {11, 12, 0, 0, 0, 0, 0, 1, 0, 0};
        move0ToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void move0ToEnd(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
    }
}
