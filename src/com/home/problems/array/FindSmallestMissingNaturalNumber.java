/*
 * Find the smallest positive number missing from an unsorted array
 * */

package com.home.problems.array;

import java.util.Arrays;

public class FindSmallestMissingNaturalNumber {
    public static void main(String[] args) {
        int[] A = {-1, 1, -3, 4, 2};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        int min = A[0];
        int max = A[A.length - 1];
        if (max <= 0)
            return 1;

        int i;
        for (i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                min = A[i];
                break;
            }
        }

        if (min != 1)
            return 1;

        for (i = i + 1; i < A.length; i++) {
            if (min == A[i] - 1) {
                min = A[i];
                continue;
            } else if (min == A[i]) {
                continue;
            } else {
                min++;
                break;
            }
        }
        if (min == max)
            return ++min;
        else
            return min;
    }
}
