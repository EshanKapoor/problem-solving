package com.home.problems.array;

public class FindSecondLargest {
    public static void main(String[] args) {
        int[] arr = {20, 20, 20, 8};
        int secondLargestIndex = findSecondLargest(arr);
        System.out.println(secondLargestIndex);
    }

    private static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }
        int max = 0;
        int secondInd = -1;
        int i;
        for (i = 1; i < arr.length; i++) {
            if (arr[0] > arr[i]) {
                secondInd = i;
                break;
            } else if (arr[i] > arr[0]) {
                secondInd = 0;
                max = i;
                break;
            }
        }

        if (secondInd != -1) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] > arr[max]) {
                    secondInd = max;
                    max = j;
                } else if(j > secondInd) {
                    secondInd = j;
                }
            }
            return secondInd;
        } else {
            return -1;
        }
    }
}
