package com.home.problems;

import java.util.Scanner;

public class HourGlassSum {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		
		int result = hourglassSum(arr);
		System.out.println(result);
	}

	static int hourglassSum(int[][] arr) {
		int[] hourGlassArr = new int[16];
		int count = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				hourGlassArr[count] = getFirstRowSum(arr, i, j) + getDiagonalElementValue(arr, i, j)
						+ getLastRowSum(arr, i, j);
				count++;
			}
		}

		int max = hourGlassArr[0];
		for (int e : hourGlassArr) {
			if (e > max) {
				max = e;
			}
		}
		return max;
	}

	private static int getFirstRowSum(int[][] arr, int i, int j) {
		return arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
	}

	private static int getDiagonalElementValue(int[][] arr, int i, int j) {
		return arr[i + 1][j + 1];
	}

	private static int getLastRowSum(int[][] arr, int i, int j) {
		return arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
	}
}
