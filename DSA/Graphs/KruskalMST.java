package com.DSA.Graphs;
//We will implement the Kruskal's algorithm

import java.util.Arrays;
import java.util.Scanner;
//We will create an Edge class where we will store the vertices and the weight of the edges.
//We will create an array of object of the edge class and each object in an edge its properties. We will ask the user for the no of vertices and no of edges. Then we will create and array of Edges and aks for the edge's details from the user and store in the array.
//Then we will pass it to the function to get the MST. In the function, we will first sort the array on the basis of the edge's weight. As the array is of objects, we can't just sort them using any sorting algo we know,for this we will use the Comparable interface. After implementing this interface, we will override the required function. Then Arrays.sort() will do the job.
//We will create an array named parent and the MST array itself. We will take help of getParents() function to check whether two vertices belong to the same parent set or not. If they are not from the same parent set, we wil add them to the MST array. Finally, return the MST array.
class Edge implements Comparable<Edge> {
    int v1, v2, weight;

    public Edge(int v1, int v2, int weight) {
        this.v1 = v1;
        this.v2 = v2;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge o) {
        return this.weight - o.weight;
    }
}


public class KruskalMST {

    private static int findParent(int v, int[] parent) {
        if (v == parent[v]) {
            return v;
        }
        return findParent(parent[v], parent);    //if the parent is updated once or multiple times then we need to go the top most parent and return it.
    }


    public static Edge[] kruskalAlgorithm(Edge[] edges, int noOfVertices) {
        Arrays.sort(edges);
        Edge[] MST = new Edge[noOfVertices - 1];
        int[] parent = new int[noOfVertices];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }

        int count = 0, j = 0;
        while (count != noOfVertices - 1) {
            Edge currentEdge = edges[j++];      //give the current value of j and update it for the next iteration
            int v1Parent = findParent(currentEdge.v1, parent);
            int v2Parent = findParent(currentEdge.v2, parent);
            if (v1Parent != v2Parent) {

                MST[count] = currentEdge;
                count++;
                parent[v1Parent] = v2Parent;
            }
        }


        return MST;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the no of vertices: ");
        int v = scan.nextInt();
        System.out.print("Enter the no of edges");
        int e = scan.nextInt();
        Edge[] arr = new Edge[e];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter v1,v2 and their weight: ");
            int v1 = scan.nextInt();
            int v2 = scan.nextInt();
            int weight = scan.nextInt();
//            Edge edge = new Edge(v1, v2, weight);     //same thing
            arr[i] = new Edge(v1, v2, weight);
        }
        Edge[] mst = kruskalAlgorithm(arr, v);
        for (int i = 0; i < mst.length; i++) {
            if (mst[i].v1 < mst[i].v2) {
                System.out.print(mst[i].v1 + " " + mst[i].v2 + " " + mst[i].weight);
            } else {
                System.out.println(mst[i].v2 + " " + mst[i].v1 + " " + mst[i].weight);
            }
        }
    }
}
