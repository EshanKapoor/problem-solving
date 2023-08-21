/**
 * Sara's Students (Contest)
 * medium
 * Problem Statement
 * Sara has 2*N chocolate boxes with uneven chocolates in them. She wants to distribute the boxes to N of her students. For each student, Sara will pick one box from the start and one box from the end. Since the chocolates are uneven Sara wants to know the maximum number of chocolates a student received.
 * <p>
 * The boxes are represented by a singly linked list in which each node represents the number of chocolates in the current box.
 * Input
 * User Task:
 * Since this will be a functional problem, you don't have to take input. You just have to complete the function maxChocolates() that takes the head node of the linked list as a parameter.
 * <p>
 * Constraints:
 * 1 <=N <= 5000
 * 1 <=node.data<= 10000
 * Output
 * Print the maximum number of chocolates a student received.
 * Example
 * Sample Input:-
 * 5
 * 1 2 3 4 5 3 2 1 4 5
 * <p>
 * Sample Output:-
 * 8
 * <p>
 * Explanation:-
 * Given list:- 1- >2- >3- >4- >5- >3- >2- >1- >4- >5
 * Student 1 received:- 1 + 5 = 6
 * Student 2 received:- 2 + 4 = 6
 * Student 3 received:- 3 + 1 = 4
 * Student 4 received:- 4 + 2 = 6
 * Student 5 received:- 5 + 3 = 8
 * <p>
 * Sample Input:-
 * 2
 * 1 4 2 3
 * <p>
 * Sample Output:-
 * 6
 */
package com.home.problems.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class MaxChocolates {
    static class Node {
        Node next;
        int val;

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Node n10 = new Node(5, null);
        Node n9 = new Node(4, n10);
        Node n8 = new Node(1, n9);
        Node n7 = new Node(2, n8);
        Node n6 = new Node(3, n7);
        Node n5 = new Node(5, n6);
        Node n4 = new Node(4, n5);
        Node n3 = new Node(3, n4);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1, n2);
        System.out.println(maxChocolates(n1));
    }

    public static int maxChocolates(Node head) {
        List<Integer> list = new ArrayList<>();
        Node current = head;
        while (current != null) {
            list.add(current.val);
            current = current.next;
        }

        int max = -1;
        for (int i = 0, j = list.size() - 1; i < j; i++, j--) {
            int sum = list.get(i) + list.get(j);
            if(sum > max)
                max = sum;
        }
        return max;
    }
}
