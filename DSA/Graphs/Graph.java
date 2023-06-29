package com.DSA.Graphs;

import com.DSA.Queues.QueueEmptyException;
import com.DSA.Queues.QueueUsingLinkedList;

import java.util.Scanner;

public class Graph {
    public Graph(){

    }
    public static int[][] takeInput() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int e = scan.nextInt();
        int[][] edges = new int[n][n];
        for (int i = 0; i < e; i++) {
            int sv = scan.nextInt();
            int ev = scan.nextInt();
            edges[sv][ev] = 1;
            edges[ev][sv] = 1;
        }
        return edges;
    }

    private static void printDFSHelper(int[][] edges, int sv, boolean[] visited) {
        int n = edges.length;
        System.out.print(sv + " ");
        visited[sv] = true;
        for (int i = 0; i < n; i++) {
            if (edges[sv][i] == 1 && !visited[i])
                printDFSHelper(edges, i, visited);
        }
    }

    public static void printDFS(int[][] edges) {
        boolean[] visited = new boolean[edges.length];
        for (int i = 0; i < edges.length; i++) {
            if (!visited[i]) {
                printDFSHelper(edges, i, visited);
            }
        }
    }

    public static void printBFSHelper(int[][] edges, int sv, boolean[] visited) {
        QueueUsingLinkedList<Integer> queue = new QueueUsingLinkedList<>();
        queue.enqueue(sv);
        visited[sv] = true;
        while (!queue.isEmpty()) {
            int front;
            try {
                front = queue.dequeue();
            } catch (QueueEmptyException e) {
                return;
            }
            System.out.print(front + " ");
            for (int i = 0; i < edges.length; i++) {
                if (edges[front][i] == 1 && !visited[i]) {
                    queue.enqueue(i);
                    visited[i] = true;
                }
            }


        }
    }

    public static void printBFS(int[][] edges) {
        boolean[] visited = new boolean[edges.length];
        for (int i = 0; i < edges.length; i++) {

            if (!visited[i]) {
                printBFSHelper(edges, i, visited);
            }
        }
    }

//    public static void main(String[] args) {
//
//        int[][] edges = takeInput();
//        printDFS(edges);
//        System.out.println();
//        printBFS(edges);
//    }


}
