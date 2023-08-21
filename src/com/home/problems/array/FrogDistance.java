/**
 * Maximum distance two frogs can create by starting at any index in a list in O(n) or less time?

 Frog Jumps

 2 frogs can start on any index in the given input_array. The function should return the maximum possible distance these frogs can create between them (difference between the index values of both) by having them jump farther away from each other.

 Frogs can only jump on higher value elements or some of the same height, and they can not skip any elements.

 Input: [1, 5, 5, 2, 6]

 Output: 4. Largest distance of 4 is created by having spawn location 3 (0-indexed) and left frog jump until index 1
 and right frog jumps until index 4.
 Therefore, 4-1+1 = 4;

 len(input_array) is between 2 and 200 000. Values in array are integers between 1 and 1 000 000 000.

 */
package com.home.problems.array;

public class FrogDistance {
    public static void main(String[] args) {
        int[] blocks = {1,5,5,2,6};
        int maxDistance = 0;
        for (int i = 0; i < blocks.length; i++) {
            int k = getFrontIndex(i, blocks);
            int j = getRearIndex(i, blocks);
            if (maxDistance < k - j + 1) {
                maxDistance = k - j + 1;
            }
        }
        System.out.println(maxDistance);
    }

    private static int getFrontIndex(int i, int[] blocks) {
        int frontIndex = i;
        while (i < blocks.length - 1 && blocks[i + 1] >= blocks[i]) {
            frontIndex = i + 1;
            i++;
        }
        return frontIndex;
    }

    private static int getRearIndex(int i, int[] blocks) {
        int rearIndex = i;
        while (i > 0 && blocks[i - 1] >= blocks[i]) {
            rearIndex = i - 1;
            i--;
        }
        return rearIndex;
    }
}
