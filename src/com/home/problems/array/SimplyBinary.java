/**
 * Given an array of N elements where each element is either 1 or 0. You have to divide the array into maximum number of subarrays such that each element of the array is in exactly one subarray such that each subarray has equal number of 1's and 0's.
 * Input
 * First line of input contains N.
 * Second line of input contains N space separated elements of the array.
 *
 * Constraints:
 * 1 <= N <= 100000
 * 0 <= elements of the array <= 1
 * Output
 * Print the single integer which is the maximum number of subarrays the array can be divided into. If it is not possible then print -1.
 *
 * Sample input 1
 * 4
 * 1 0 1 0
 *
 * Sample output 1
 * 2
 *
 * Sample input 2
 * 4
 * 1 1 0 0
 *
 * Sample output 2
 * 1
 */
package com.home.problems.array;

import java.util.Scanner;

public class SimplyBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = -1;
        }

        arr[0] = sc.nextInt();
        int j = 0;
        int c = 0;
        for (int i = 1; i < n; i++) {
            int next = sc.nextInt();
            if (j == 0 && arr[j] == -1) {
                arr[j] = next;
            } else if (arr[j] != next && j == 0) {
                arr[j] = -1;
                c++;
            } else if (arr[j] != next) {
                arr[j] = -1;
                j--;
            } else {
                j++;
                arr[j] = next;
            }
        }

        if (arr[0] != -1) {
            System.out.println(-1);
        } else {
            System.out.println(c);
        }
    }
}

/*
 Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int count0=0;
        int count1=0;
        int totalCount=0;
        int count=0;
        int num;
        for(int i=0;i<n;i++){
            num=sc.nextInt();
            if(num==0){
                count0++;

            }
            else{
                count1++;
            }
            if(count0==count1){
                count++;
                totalCount=totalCount+count1+count0;
                 count0=0;
                count1=0;
            }
        }

        if(count==0 || totalCount !=n){
            System.out.print("-1");
        }
        else{
            System.out.print(count);
        }
 */
