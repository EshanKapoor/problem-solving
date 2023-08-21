package com.home.problems;

public class ArrayManipulation {
    public static void main(String[] args) {
        int n = 5;
        int[][] queries = {{1, 2, 100}, {2, 5, 100}, {3, 4, 100}};
        System.out.println(arrayManipulation(n, queries));
    }

    public static long arrayManipulation(int n, int[][] queries) {
        long[] arr = new long[n+1];
        for(int i=0; i<queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            int k = queries[i][2];

            arr[a] += k;
            if(b < n)
                arr[b+1] -= k;
        }

        long max = max(arr);
        return max;
    }

    private static long max(long[] arr) {
        long max = Long.MIN_VALUE;
        long sum = 0l;
        for(int i=1; i< arr.length; i++) {
            sum += arr[i];
            max = Math.max(max, sum);
        }
        return max;
    }
}
