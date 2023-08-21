package com.home.datastructure.tree;

public class GenericBinarySearchTree<X extends Comparable<X>>
{
    private Node<X> root;

    public Node<X> getRoot()
    {
        return root;
    }

    public void insert(Node<X> newNode)
    {
        if(root == null)
        {
            root = newNode;
        }
        else
        {
            add(root, newNode);
        }
    }

    private void add(Node<X> parent, Node<X> newNode)
    {
        if(newNode.getData().compareTo(parent.getData()) <= 0)
        {
            //add node at left
            if(parent.getLeftChild() == null)
            {
                parent.setLeftChild(newNode);
            }
            else
            {
                add(parent.getLeftChild(), newNode);
            }

        }
        else if(newNode.getData().compareTo(parent.getData()) > 0)
        {
            //add node at right
            if(parent.getRightChild() == null)
            {
                parent.setRightChild(newNode);
            }
            else
            {
                add(parent.getRightChild(), newNode);
            }
        }
    }

    public Node<X> findNode(X data) throws Exception
    {
        if(data == null)
        {
            throw new Exception("Provide a valid value!");
        }
        else
        {
            return searchNode(root, data);
        }
    }

    private Node<X> searchNode(Node<X> parent, X data)
    {
        if(parent == null)
        {
            System.out.println("Node not found");
            return null;
        }

        if(parent.getData().equals(data))
        {
            System.out.println("Node found : " + parent.getData() + "  " + parent.getName());
            return parent;
        }
        else if(data.compareTo(parent.getData()) < 0)
        {
            return searchNode(parent.getLeftChild(), data);
        }
        else
        {
            return searchNode(parent.getRightChild(), data);
        }
    }
}