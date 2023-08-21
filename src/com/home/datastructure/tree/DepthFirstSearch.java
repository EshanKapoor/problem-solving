package com.home.datastructure.tree;

public class DepthFirstSearch<X extends Comparable<X>>
{
    public void inOrderTraversal(Node<X> focusNode)
    {
        if(focusNode == null)
        {
            return;
        }
        else
        {
            inOrderTraversal(focusNode.getLeftChild());
            System.out.println(focusNode.getData() + "  " + focusNode.getName());
            inOrderTraversal(focusNode.getRightChild());
        }
    }

    public void preOrderTraversal(Node<X> focusNode)
    {
        if(focusNode == null)
        {
            return;
        }
        else
        {
            System.out.println(focusNode.getData() + "  " + focusNode.getName());
            preOrderTraversal(focusNode.getLeftChild());
            preOrderTraversal(focusNode.getRightChild());
        }
    }

    public void postOrderTraversal(Node<X> focusNode)
    {
        if(focusNode == null)
        {
            return;
        }
        else
        {
            postOrderTraversal(focusNode.getLeftChild());
            postOrderTraversal(focusNode.getRightChild());
            System.out.println(focusNode.getData() + "  " + focusNode.getName());
        }
    }
}