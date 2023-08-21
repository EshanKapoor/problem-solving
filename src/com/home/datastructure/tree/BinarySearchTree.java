package com.home.datastructure.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTree {
    static class Node {
        private int data;
        private Node leftChild;
        private Node rightChild;

        private Node(int data) {
            this.data = data;
        }

        public Node getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }

        public Node getRightChild() {
            return rightChild;
        }

        public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }
    }

    private Node root;

    public static Node newNode(int item) {
        return new BinarySearchTree.Node(item);
    }

    public void insert(Node newNode) {
        if (root == null) {
            root = newNode;
            return;
        }

        Node current = root;
        while (true) {
            if (newNode.data < current.data) {
                if (current.leftChild == null) {
                    current.leftChild = newNode;
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = newNode;
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    public boolean find(Node newNode) {
        if (root == null) {
            System.out.println("Tree is empty");
            return false;
        }

        Node current = root;
        while (current != null) {
            if (newNode.data == current.data) {
                return true;
            } else if (newNode.data < current.data) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
        }
        return false;
    }

    public void preOrderTraversal() {
        preOrderTraversal(root);
    }

    private void preOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data);
        preOrderTraversal(node.leftChild);
        preOrderTraversal(node.rightChild);
    }

    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.leftChild);
        System.out.println(node.data);
        inOrderTraversal(node.rightChild);
    }

    public void postOrderTraversal() {
        postOrderTraversal(root);
    }

    private void postOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.leftChild);
        postOrderTraversal(node.rightChild);
        System.out.println(node.data);
    }

    public int findMinimumValue() {
        if (root == null) {
            throw new IllegalStateException("Tree is empty");
        }


        Node current = root;
        while (current.leftChild != null) {
            current = current.leftChild;
        }
        return current.data;
    }

    public int findMinimumValueRecursively() {
        return findMinimumValueRecursively(root);
    }

    private int findMinimumValueRecursively(Node node) {
        if (node.leftChild == null) {
            return node.data;
        }
        return findMinimumValueRecursively(node.leftChild);

    }

    public int findMaximumValue() {
        Node current = root;
        while (current.rightChild != null) {
            current = current.rightChild;
        }
        return current.data;
    }

    public int findMaximumValueRecursively() {
        return findMaximumValueRecursively(root);
    }

    private int findMaximumValueRecursively(Node node) {
        if (node.rightChild == null) {
            return node.data;
        }
        return findMaximumValueRecursively(node.rightChild);
    }

    public int height() {
        return height(root);
    }

    private int height(Node node) {
        if (node == null)
            return -1;

        return Math.max(height(node.leftChild), height(node.rightChild)) + 1;
    }

    public int depth() {
        return depth(root);
    }

    private int depth(Node node) {
        if (node == null) {
            System.out.println("Node is null");
            return -1;
        }

        int depth = 0;
        Node current = root;
        while (current != null) {
            if (node.data == current.data) {
                return depth;
            } else if (node.data < current.data) {
                current = current.leftChild;
                depth++;
            } else {
                current = current.rightChild;
                depth++;
            }
        }
        System.out.println("Node not found in tree!");
        return -1;
    }

    public boolean equals(BinarySearchTree other) {
        if (other == null)
            return false;
        return equals(root, other.root);
    }

    private boolean equals(Node first, Node second) {
        if (first == null && second == null)
            return true;

        if (first != null && second != null) {
            return first.data == second.data
                    && equals(first.leftChild, second.leftChild)
                    && equals(first.rightChild, second.rightChild);
        }

        return false;
    }

    public boolean isBinarySearchTree() {
        if (root == null)
            throw new IllegalStateException("Tree is empty");

        return isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBinarySearchTree(Node node, int minValue, int maxValue) {
        if (node == null)
            return true;

        return node.data > minValue && node.data < maxValue
                && isBinarySearchTree(node.leftChild, minValue, node.data)
                && isBinarySearchTree(node.rightChild, node.data, maxValue);
    }

    public void printNodesAtLevel(int level) {
        if (level < 0)
            throw new IllegalStateException("Level cannot be less than Zero!");

        List<Integer> list = new ArrayList<>();
        printNodesAtLevel(0, level, root, list);
        System.out.printf("Nodes at level %s are %s \n", level, list);
    }

    //rather than taking 2 variables - counter and level, we could also take just 1 variable, say distance,
    //and decrease its value on every recursive call.
    //Then when we finally reach  distance == 0, we can print the values.
    private void printNodesAtLevel(int counter, int level, Node node, List<Integer> list) {
        if (node == null)
            return;

        if (counter == level) {
            list.add(node.data);
            return;
        }

        counter = counter + 1;
        printNodesAtLevel(counter, level, node.leftChild, list);
        printNodesAtLevel(counter, level, node.rightChild, list);
    }

    public void levelOrderTraversal() {
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        System.out.print("Level order traversal : ");
        levelOrderTraversal(queue);
        System.out.println();
    }

    private void levelOrderTraversal(Queue<Node> queue) {
        if (queue.isEmpty()) {
            return;
        }

        Node node = queue.remove();
        System.out.print(node.data + " ");

        if (node.leftChild != null)
            queue.add(node.leftChild);
        if (node.rightChild != null)
            queue.add(node.rightChild);

        levelOrderTraversal(queue);
    }

}