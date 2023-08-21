/**
 * 41. First Missing Positive
 * Hard

 * Given an unsorted integer array nums, return the smallest missing positive integer.
 * <p>
 * You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,0]
 * Output: 3
 * Explanation: The numbers in the range [1,2] are all in the array.
 * Example 2:
 * <p>
 * Input: nums = [3,4,-1,1]
 * Output: 2
 * Explanation: 1 is in the array but 2 is missing.
 * Example 3:
 * <p>
 * Input: nums = [7,8,9,11,12]
 * Output: 1
 * Explanation: The smallest positive integer 1 is missing.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 105
 * -231 <= nums[i] <= 231 - 1
 */
package com.home.problems.array;

public class FirstMissingPositiveInteger {
    public static void main(String[] args) {
        int[] nums = {4, -1, 8, 3, 1, 2, 5};
        System.out.println(firstMissingPositiveInteger(nums));
    }

    public static int firstMissingPositiveInteger(int[] nums) {
        boolean isOnePresent = false;

        for (int n : nums) {
            if (n == 1) {
                isOnePresent = true;
                break;
            }
        }

        if (isOnePresent) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= 0 || nums[i] > nums.length) {
                    nums[i] = 1;
                }
            }

            for (int i = 0; i < nums.length; i++) {
                int index = Math.abs(nums[i]) - 1;
                nums[index] = -Math.abs(nums[index]);
            }

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) {
                    return i + 1;
                }
            }
            return nums.length + 1;
        } else {
            return 1;
        }
    }
}
