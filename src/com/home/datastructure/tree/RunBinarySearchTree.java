package com.home.datastructure.tree;

import static com.home.datastructure.tree.BinarySearchTree.newNode;

public class RunBinarySearchTree {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        BinarySearchTree.Node root = newNode(20);
        bst.insert(root);
        bst.insert(newNode(10));
        bst.insert(newNode(30));
        bst.insert(newNode(6));
        bst.insert(newNode(14));
        bst.insert(newNode(24));
        bst.insert(newNode(3));
        bst.insert(newNode(8));
        bst.insert(newNode(26));
        bst.insert(newNode(36));

        System.out.println(bst.find(newNode(30)));

        System.out.println("Pre Order");
        bst.preOrderTraversal();

        System.out.println("In Order");
        bst.inOrderTraversal();

        System.out.println("Post Order");
        bst.postOrderTraversal();

        System.out.println("Min value " + bst.findMinimumValue());
        System.out.println("Min value recursively " + bst.findMinimumValueRecursively());

        System.out.println("Max value " + bst.findMaximumValue());
        System.out.println("Max value recursively " + bst.findMaximumValueRecursively());

        System.out.println("Height of Root Node or Tree " + bst.height());

        System.out.println("Depth of Root Node " + bst.depth());

        BinarySearchTree bst2 = new BinarySearchTree();
        bst2.insert(newNode(20));
        bst2.insert(newNode(10));
        bst2.insert(newNode(30));
        bst2.insert(newNode(6));
        bst2.insert(newNode(14));
        bst2.insert(newNode(24));
        bst2.insert(newNode(3));
        bst2.insert(newNode(8));
        bst2.insert(newNode(26));
        bst2.insert(newNode(36));

        System.out.println("Are trees equal? : " + bst.equals(null));

        BinarySearchTree tree = new BinarySearchTree();
        BinarySearchTree.Node rooot = newNode(20);
        tree.insert(rooot);
        rooot.setLeftChild(newNode(10));
        rooot.setRightChild(newNode(22));

        rooot.getLeftChild().setLeftChild(newNode(6));
        rooot.getLeftChild().setRightChild(newNode(11));
        rooot.getLeftChild().getLeftChild().setLeftChild(newNode(3));
        rooot.getLeftChild().getLeftChild().setRightChild(newNode(8));

        rooot.getRightChild().setLeftChild(newNode(21));

        System.out.println("Is a valid Binary Search Tree? : " + tree.isBinarySearchTree());

        bst.printNodesAtLevel(3);

        bst.levelOrderTraversal();
    }
}
