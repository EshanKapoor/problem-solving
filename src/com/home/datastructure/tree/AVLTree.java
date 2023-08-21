package com.home.datastructure.tree;

public class AVLTree {

    private AVLNode root;

    static class AVLNode {
        private int data;
        private int height;
        private AVLNode leftChild;
        private AVLNode rightChild;

        public AVLNode(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "data = " + data;
        }
    }

    public void insert(int data) {
        System.out.println("Insert " + data);
        root = insert(root, data);
    }

    private AVLNode insert(AVLNode parent, int data) {
        if (parent == null)
            return new AVLNode(data);

        if (data < parent.data) {
            parent.leftChild = insert(parent.leftChild, data);
        } else if (data > parent.data) {
            parent.rightChild = insert(parent.rightChild, data);
        }

        setHeight(parent);
        return balance(parent);
    }

    private AVLNode balance(AVLNode parent) {
        if (isLeftHeavy(parent)) {
            if (balanceFactor(parent.leftChild) < 0) {
                System.out.println("Rotate Left " + parent.leftChild.data);
                parent.leftChild = rotateLeft(parent.leftChild);
            }
            System.out.println("Rotate Right " + parent.data);
            return rotateRight(parent);
        } else if (isRightHeavy(parent)) {
            if (balanceFactor(parent.rightChild) > 0) {
                System.out.println("Rotate Right " + parent.rightChild.data);
                parent.rightChild = rotateRight(parent.rightChild);
            }
            System.out.println("Rotate Left " + parent.data);
            return rotateLeft(parent);
        }
        return parent;
    }

    private AVLNode rotateLeft(AVLNode parent) {
        AVLNode newParent = parent.rightChild;
        parent.rightChild = newParent.leftChild;
        newParent.leftChild = parent;

        setHeight(parent);
        setHeight(newParent);

        return newParent;
    }

    private AVLNode rotateRight(AVLNode parent) {
        AVLNode newParent = parent.leftChild;
        parent.leftChild = newParent.rightChild;
        newParent.rightChild = parent;

        setHeight(parent);
        setHeight(newParent);

        return newParent;
    }

    private int balanceFactor(AVLNode node) {
        return node == null ? 0 : getHeight(node.leftChild) - getHeight(node.rightChild);
    }

    private boolean isLeftHeavy(AVLNode node) {
        return balanceFactor(node) > 1;
    }

    private boolean isRightHeavy(AVLNode node) {
        return balanceFactor(node) < -1;
    }

    private void setHeight(AVLNode parent) {
        parent.height = Math.max(getHeight(parent.leftChild), getHeight(parent.rightChild)) + 1;
    }

    private int getHeight(AVLNode node) {
        return node == null ? -1 : node.height;
    }
}
