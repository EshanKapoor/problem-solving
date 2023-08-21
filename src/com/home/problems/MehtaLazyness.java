package com.home.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MehtaLazyness {
	static List<Integer> properDivisors;
	static List<Integer> perfectSquares;

	public static void main(String[] args) {
		int t;
		int n[];
		System.out.println("Please begin:");
		Scanner scan = new Scanner(System.in);
		t = scan.nextInt();
		if (t >= 1 && t <= 40000) {
			n = new int[t];
		} else {
			scan.close();
			return;
		}

		for (int i = 0; i < t; i++) {
			n[i] = scan.nextInt();
			if (n[i] >= 2 && n[i] <= 1000000) {
				if (n[i] % 2 != 0 || n[i] == 2) {
					System.out.println(0);
				} else {
					System.out.println(solve(n[i]));
				}
			} else {
				System.out.println(0);
			}
		}
		scan.close();
	}

	private static String solve(int num) {
		getProperDivisors(num);
		getPerfectSquares();
		return perfectSquares.size() + "/" + properDivisors.size();
	}

	private static void getProperDivisors(int num) {
		properDivisors = new ArrayList<>();
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				properDivisors.add(i);
			}
		}
	}

	private static void getPerfectSquares() {
		perfectSquares = new ArrayList<>();
		for (int num : properDivisors) {
			if (num == 1)
				continue;
			if (num % 2 == 0) {
				int sqrt = (int) Math.sqrt(num);
				if (sqrt * sqrt == num) {
					perfectSquares.add(num);
				}
			}
		}
	}
}
