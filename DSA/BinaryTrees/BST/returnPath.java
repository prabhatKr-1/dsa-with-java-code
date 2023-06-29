//Search a node in the given tree, if the element in present , return the path from node to root, else return null.
package com.DSA.BinaryTrees.BST;

import com.DSA.BinaryTrees.BinaryTreeNode;
import com.DSA.BinaryTrees.InputAndPrint;

import java.util.ArrayList;
import java.util.Scanner;

public class returnPath extends InputAndPrint {
    public static ArrayList<Integer> findPath(BinaryTreeNode<Integer> root, int node) {
        if (root == null)   //base case
            return null;


        if (root.data == node) {
            ArrayList<Integer> path = new ArrayList<>();
            path.add(root.data);
            return path;
        } else if (root.data > node) {
            ArrayList<Integer> leftSide = findPath(root.left, node);
            if (leftSide != null)
                leftSide.add(root.data);
            return leftSide;

        } else {
            ArrayList<Integer> rightSide = findPath(root.right, node);
            if (rightSide != null)
                rightSide.add(root.data);
            return rightSide;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the Binary Search Tree");
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the node you want the path of: ");
        int node = scan.nextInt();
        ArrayList<Integer> path = findPath(root, node);
        if (path != null) {
            for (int ele :
                    path) {
                System.out.print(ele + " ");
            }
        } else
            System.out.print("Node not present!");
    }
}
