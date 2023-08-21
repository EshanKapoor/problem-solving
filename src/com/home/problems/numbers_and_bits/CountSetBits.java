package com.home.problems.numbers_and_bits;

public class CountSetBits {
    public static void main(String[] args) {
        int n = 1;
        /**Using Brian Kernighan's Algorithm
         *
         * VERY IMPORTANT CONCEPT - When we subtract one from any number,
         * it inverts all the bits from the rightmost set bit(inclusive) i.e. it turns 1 to 0 and 0 to 1.
         *
         * Subtracting 1 from 6 gives 5, 0110-0001 = 0101.  LSB 0 and 1 (in 6) got converted into 1 and 0 (in 5)
         * Similarly this works for all binary numbers.
         * Then simply do 6 & 5, and all the bits that got inverted will become 0. That's how & works.
         * So, if the rightmost set bits keep on getting reversed, the number eventually turns 0 and the loop ends.
         *
         * For example, if n is 101010 then n-1 = 101001. Thus, n & n-1 becomes 101000. (LSB 1 reduced to 0)
         * When we perform bitwise & operation between n and n-1, all the bits from the rightmost set bit turn into zero.
         */

        int count = 0;
        while(n > 0) { //Time complexity is O(no of set bits)
            n  = n & n-1;
            count++;
        }

        System.out.println(count);
    }
}
