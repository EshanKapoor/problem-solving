package com.home.datastructure.tree;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RunAVLTree {
    public static void main(String[] args) {
        AVLTree avlTree = new AVLTree();
        avlTree.insert(12);
        avlTree.insert(3);
        avlTree.insert(9);
        avlTree.insert(4);
        avlTree.insert(6);
        avlTree.insert(2);

        List<Integer> collect = Arrays.stream(new int[]{1, 2, 3}).boxed().collect(Collectors.toList());
        System.out.println(collect);
    }
}
