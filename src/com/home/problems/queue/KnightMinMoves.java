package com.home.problems.queue;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class KnightMinMoves {

    static class Node {
        private int x;
        private int y;
        private int moves;

        public Node(int x, int y, int moves) {
            this.x = x;
            this.y = y;
            this.moves = moves;
        }
    }

    private static int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
    private static int[] dy = {-1, 1, -2, 2, -2, 2, -1, 1};

    public static int calcMinMoves(Node source, Node target, int N) {
        Set<String> visited = new HashSet<>();
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(source);

        while (!queue.isEmpty()) {
            Node current = queue.remove();

            if (current.x == target.x && current.y == target.y) {
                System.out.println("Target found at " + current.x + "," + current.y);
                return current.moves;
            }

            for (int i = 0; i < dx.length; i++) {
                int x = current.x + dx[i];
                int y = current.y + dy[i];

                String coordinate = x + "," + y;

                if (!visited.contains(coordinate) &&
                        x >= 0 && x < N &&
                        y >= 0 && y < N) {
                    Node newNode = new Node(x, y, current.moves + 1);
                    queue.add(newNode);
                    visited.add(coordinate);
                }
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        int N = 6;
        // coordinates of source & target cell
        Node source = new Node(5, 1, 0);
        Node target = new Node(0, 5, -1);
        System.out.println("Moves : " + calcMinMoves(source, target, N));
    }
}
