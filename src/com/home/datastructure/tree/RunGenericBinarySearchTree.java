package com.home.datastructure.tree;

public class RunGenericBinarySearchTree
{
    public static void main(String[] args)
    {
        System.out.println("**** Binary Search Tree ****");
        new RunGenericBinarySearchTree().performOperations();
    }

    public void performOperations()
    {
        GenericBinarySearchTree<Integer> bst = new GenericBinarySearchTree<>();
        bst.insert(new Node<Integer>("Eshan", 28));
        bst.insert(new Node<Integer>("Papa", 56));
        bst.insert(new Node<Integer>("Vrinda", 24));
        bst.insert(new Node<Integer>("Baba", 80));
        bst.insert(new Node<Integer>("Chachu", 53));
        bst.insert(new Node<Integer>("Kishori", 21));

		DepthFirstSearch<Integer> dfs = new DepthFirstSearch();
		System.out.println("**** In Order Traversal ****");
        dfs.inOrderTraversal(bst.getRoot());

        System.out.println("**** Pre Order Traversal ****");
        dfs.preOrderTraversal(bst.getRoot());

        System.out.println("**** Post Order Traversal ****");
        dfs.postOrderTraversal(bst.getRoot());

        try {
        	Node<Integer> resultNode = bst.findNode(21);
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }
}