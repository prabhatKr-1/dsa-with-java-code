package com.DSA.Graphs;

import com.DSA.Queues.QueueEmptyException;
import com.DSA.Queues.QueueUsingLinkedList;

import java.util.Scanner;

public class hasPath {
    public static boolean pathDFS(int[][] edges, int sv, int ev, boolean[] visited) {
        visited[sv] = true;
        if (edges[sv][ev] == 1 || sv == ev) {
            return true;
        } else {
            for (int i = 0; i < edges.length; i++) {
                if (edges[sv][i] == 1 && !visited[i]) {
                    return pathDFS(edges, i, ev, visited);
                }
            }
        }
        return false;
    }

    public static boolean pathBFS(int[][] edges, int sv, int ev, boolean[] visited) {
        if (edges[sv][ev] == 1 || sv == ev) {
            return true;
        }
        QueueUsingLinkedList<Integer> queue = new QueueUsingLinkedList<>();
        queue.enqueue(sv);
        visited[sv] = true;
        while (!queue.isEmpty()) {
            int front;

            try {
                front = queue.dequeue();
            } catch (QueueEmptyException e) {
                return false;
            }
            if (edges[front][ev] == 1)
                return true;

            for (int i = 0; i < edges.length; i++) {
                if (edges[front][i] == 1 && !visited[i]) {
                    queue.enqueue(i);
                    visited[i] = true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Graph g = new Graph();
        int[][] edges = g.takeInput();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the vertices");
        int sv = scan.nextInt();
        int ev = scan.nextInt();
        boolean[] visited = new boolean[edges.length];
//        boolean ans = pathDFS(edges, sv, ev, visited);
        boolean ans = pathBFS(edges, sv, ev, visited);
        System.out.println(ans);

    }
}
//Test case:
//        6 3
//        5 3
//        0 1
//        3 4
//        0 3