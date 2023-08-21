package com.home.problems.numbers_and_bits;


import java.util.Scanner;

public class BinaryRepresentation {
    static String binaryNum = "";

    public static void main(String[] args) {
        System.out.print("Please enter a number: ");
        int num = new Scanner(System.in).nextInt();
        getBinaryRepresentation(num);
        System.out.println(String.format("Binary Representation of %d is %s", num, binaryNum));

        printBinaryRepresentation(num);

        int counter = 0;
        for (int i = 0; i < binaryNum.length(); i++) {
            if (binaryNum.charAt(i) == '1') {
                counter++;
            }
        }
        System.out.println("\nNo. of set bits are: " + counter);
        System.out.println("No. of set bits are: " + binaryNum.chars()
                .filter(c -> c == '1')
                .count());
    }

    public static void getBinaryRepresentation(int num) {
        if (num > 1) {
            getBinaryRepresentation(num / 2);
            binaryNum += num % 2;
        } else {
            binaryNum += num;
            return;
        }
    }

    public static void printBinaryRepresentation(int num) {
        if (num > 1) {
            printBinaryRepresentation(num / 2);
        }
        System.out.print(num % 2);
    }
}
