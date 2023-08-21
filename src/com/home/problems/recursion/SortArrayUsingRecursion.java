package com.home.problems.recursion;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortArrayUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 2};
        List<Integer> list = IntStream.of(arr).boxed().collect(Collectors.toList());
        sort(list);
        System.out.println(list);
    }

    public static void sort(List<Integer> list) {
        if (list.size() == 1) {
            return;
        }

        int temp = list.remove(list.size() - 1);
        sort(list);
        insert(list, temp);
    }

    public static void insert(List<Integer> list, Integer elem) {
        if (list.isEmpty() || list.get(list.size() - 1) <= elem) {
            list.add(elem);
            return;
        }

        Integer temp = list.remove(list.size() - 1);
        insert(list, elem);
        list.add(temp);
    }

}
