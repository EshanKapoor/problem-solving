package com.home.problems.recursion;

import java.util.Stack;

public class SortStackUsingRecursion {
    public static void main(String[] args) {
        Stack<Integer> input = new Stack<>();
        input.push(34);
        input.push(3);
        input.push(31);
        input.push(98);
        input.push(92);
        input.push(23);
        System.out.println("Stack before sorting: " + input);
        sort(input);
        System.out.println("Stack after sorting: " + input);
        System.out.println(input.peek());
    }

    private static Stack<Integer> sort(Stack<Integer> stack) {
        if (stack.size() == 1)
            return stack;

        Integer temp = stack.pop();
        sort(stack);
        insert(stack, temp);
        return stack;
    }

    private static Stack<Integer> insert(Stack<Integer> stack, Integer temp) {
        if (stack.isEmpty() || stack.peek() < temp) {
            stack.push(temp);
            return stack;
        }
        Integer tempI = stack.pop();
        insert(stack, temp);
        stack.push(tempI);
        return stack;
    }
}
