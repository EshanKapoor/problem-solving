package com.home.problems.array;

/**
 * A leader is that number which is greater(not less than or equal to) than all other numbers than itself going forward in the array.
 * If array has duplicate numbers at index i and any other index, say i+3, number at index i won't be called a leader.
 * arr = {7,10,10,4,6,5,2}
 * 10(at index 2) 6 5 and 2 are leaders. last number 2 is always a leader because it doesn't have any number beyond itself.
 * <p>
 * arr = {10,20,30}
 * o/p = 30
 * <p>
 * arr = {30,20,10}
 * o/p = 30,20,10.
 * all numbers are leaders as there is no number greater than the number going forward from any index in the array.
 */

public class FindLeaders {
    public static void main(String[] args) {
        int[] arr = {7, 10, 9, 4, 12, 5, 2};
        findLeaders(arr);
    }

    private static void findLeaders(int[] arr) {
        int len = arr.length;
        System.out.println(arr[len - 1]);
        int currentLeader = arr[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            if (arr[i] > currentLeader) {
                System.out.println(arr[i]);
                currentLeader = arr[i];
            }
        }
    }
}
