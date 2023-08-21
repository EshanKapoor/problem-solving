package com.home.problems.numbers_and_bits;

public class IsKthBit0Or1 {
    public static void main(String[] args) {
        int n = 5; //0000...0101
        int k = 3; //assume k starts from 1 not 0. So, LSB is at k=1

        /**Using Left Shift
         1 << (k-1) 2 times = 0000...0100 = 4 and & it with 5
         Therefore,
           0000...0101
         & 0000...0100
           -----------
           0000...0100   If & results in 0, bit is not set, else result will be greater than 0.
           -----------
         */
        if (( n & (1 << k-1) ) != 0) {
            System.out.println("kth bit is set");
        } else {
            System.out.println("kth bit is not set");
        }


        /**Using Right Shift
         5 >> (k-1) 2 times = 0000...0001 = 1 and & it with 1
         Therefore,
           0000...0001
         & 0000...0001
           -----------
           0000...0001 If & results in 0, bit is not set, else result will be greater than 0.
           -----------
         */
        if (( (n >> k-1) & 1 ) != 0) {
            System.out.println("kth bit is set");
        } else {
            System.out.println("kth bit is not set");
        }
    }
}
