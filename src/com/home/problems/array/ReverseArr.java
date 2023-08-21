package com.home.problems.array;

public class ReverseArr {
	static int[] reverseArray(int[] a) {
		int[] reverseArr = new int[a.length];
		int maxIndex = a.length - 1;
		for (int i = maxIndex, j = 0; i >= 0; i--, j++) {
			reverseArr[j] = a[i];
		}
		return reverseArr;
	}
	
	public static void main(String[] args) {
		int[] reverseArr = reverseArray(new int[]{1,2,3,4});
		for(int i : reverseArr) {
			System.out.println(i);
		}
	}
}
