package com.home.problems.numbers_and_bits;

public class FindTwoOddAppearingNumbers {
    public static void main(String[] args) {
        int[] arr = {3, 4, 3, 4, 5, 4, 4, 6, 7, 7};
        printOddAppearingNumbers(arr);
    }

    private static void printOddAppearingNumbers(int[] arr) {
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i]; // this will always be the xor of 2 odd appearing numbers(5 and 6) as rest would cancel out each other.
        }
        //the main idea behind the approach is - XOR of 2 bits will always be 1 if those 2 bits are different. since we xor all the numbers,
        //the numbers which appeared even times cancel out each other and the 2 numbers that appeared odd times will form XOR result in above variable.
        //Therefore, if we can find 2 groups of numbers (1 group that will always have a particular bit set in their binary value,
        // and another group which will never have this particular bit set in their binary value), we will get 1 odd appearing numbers in each group!

        //here xor is 5(101) ^ 6(110) == 3(011).
        //now, we can see that rightmost bit is 1. So, we first find an expression that will give only xor variable's rightmost bit set in it.
        xor = xor & -xor;  //this expression will only set the rightmost set bit as 1 in the entire binary number.

        //We will now divide the array in 2 groups.
        //numbers in 1 group will always have this rightmost bit set and numbers in the other group will never have this bit set.
        // and when we xor numbers in their respective groups, we find the odd appearing number from each group.
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & xor) != 0) { //these numbers will always have the rightmost bit set, so they will never result in 0
                num1 ^= arr[i];
            } else { //these numbers will never have the rightmost bit set and will always result in 0
                num2 ^= arr[i];
            }
        }

        System.out.println(num1);
        System.out.println(num2);
    }
}
