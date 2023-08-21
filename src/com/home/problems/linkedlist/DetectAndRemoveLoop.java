package com.home.problems.linkedlist;

/*
detect loop - take 2 pointers. move 1 pointer by 1 unit and other by 2. if they at some time come at same node, loop exists.
remove loop:
1) the node where both pointers met, from there iterate until that same node is visited again. count the number of nodes.
2) take 2 pointers at the distance counted in step 1. what this will do is that at one point,
   both pointers would reach the starting point of the loop.
3) now from this point, count distance-1 nodes (from step 1) and that will give you the last node.
4) just put null in its next
*/
public class DetectAndRemoveLoop {
    static Node head;

    static class Node {
        Node next;
        int data;

        Node(int d) {
            this.data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        DetectAndRemoveLoop list = new DetectAndRemoveLoop();
        DetectAndRemoveLoop.head = new Node(50);
        DetectAndRemoveLoop.head.next = new Node(20);
        DetectAndRemoveLoop.head.next.next = new Node(15);
        DetectAndRemoveLoop.head.next.next.next = new Node(4);
        DetectAndRemoveLoop.head.next.next.next.next = new Node(10);

        // Creating a loop for testing
        head.next.next.next.next.next = head.next.next;

        Node meetingPoint = list.detectLoop(head);
        int loopNodes = list.countNodesInLoop(meetingPoint);
        Node loopStartNode = list.getLoopStartNode(loopNodes);
        Node loopEndNode = list.getLoopEndNode(loopStartNode, loopNodes);
        loopEndNode.next = null;
        list.print(head);
    }

    public void print(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public Node detectLoop(Node head) {
        Node pointer1 = head;
        Node pointer2 = head.next;

        while (pointer1 != pointer2) {
            if (pointer2 == null || pointer2.next == null) {
                return null;
            }
            pointer1 = pointer1.next;
            pointer2 = pointer2.next.next;
        }
        return pointer1;
    }

    private int countNodesInLoop(Node meetingPoint) {
        int count = 1;
        Node head = meetingPoint.next;
        while (head != meetingPoint) {
            head = head.next;
            count++;
        }

        return count;
    }

    private Node getLoopStartNode(int loopNodes) {
        Node pointer1 = head;
        Node pointer2 = head;
        for (int i = 0; i < loopNodes; i++) {
            pointer2 = pointer2.next;
        }
        while (pointer1 != pointer2) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
        return pointer1;
    }

    private Node getLoopEndNode(Node loopStartNode, int loopNodes) {
        Node loopEndNode = loopStartNode;
        for (int i = 0; i < loopNodes - 1; i++) {
            loopEndNode = loopEndNode.next;
        }
        return loopEndNode;
    }
}
