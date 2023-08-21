package com.home.datastructure.tree;

class Node<X extends Comparable<X>>
{
    private Node<X> leftChild;
    private Node<X> rightChild;
    private String name;
    private X data;

    public Node(String name, X data)
    {
        leftChild = null;
        rightChild = null;
        this.name = name;
        this.data = data;
    }

    public X getData()
    {
        return data;
    }

    public Node<X> getLeftChild()
    {
        return leftChild;
    }

    public void setLeftChild(Node<X> node)
    {
        leftChild = node;
    }

    public Node<X> getRightChild()
    {
        return rightChild;
    }

     public void setRightChild(Node<X> node)
    {
        rightChild = node;
    }

    public String getName()
    {
        return name;
    }

}

