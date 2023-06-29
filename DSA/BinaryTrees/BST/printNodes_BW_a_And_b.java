package com.DSA.BinaryTrees.BST;

import com.DSA.BinaryTrees.BinaryTreeNode;
import com.DSA.BinaryTrees.InputAndPrint;

import java.util.Scanner;

public class printNodes_BW_a_And_b extends InputAndPrint {

    public static void print(BinaryTreeNode<Integer> root, int a, int b) {
        if (root == null)
            return;

        if (root.data >= a && root.data <= b) {
            print(root.left, a, b);
            System.out.print(root.data + " ");
            print(root.right, a, b);

        } else if (root.data < a) {
            print(root.right, a, b);

        } else if (root.data > b) {
            print(root.left, a, b);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the sorted tree:");
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        System.out.print("Enter the value of a and b:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        print(root, a, b);
    }
}
