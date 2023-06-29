package com.DSA.BinaryTrees.BST;

import com.DSA.BinaryTrees.BinaryTreeNode;
import com.DSA.BinaryTrees.InputAndPrint;

import java.util.Scanner;

public class searchNode extends InputAndPrint {
    public static boolean findNode(BinaryTreeNode<Integer> root, int n) {
        if (root == null) {
            return false;
        }
        if (root.data == n)      //base case
        {
            return true;
        }
        else if (root.data > n) {
            return findNode(root.left, n);
        }
        else
            return findNode(root.right, n);
    }

    public static void main(String[] args) {
        System.out.println("Enter sorted tree:");
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter what you want to search: ");
        int n = scan.nextInt();
        boolean ans = findNode(root,n);
        System.out.print("Is the node " + n + " present in the tree?\n" + ans);
    }
}
