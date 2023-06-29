package com.DSA.BinaryTrees.BST;
//A sorted array is given, converted it into BST assuming the middle element as the root

import com.DSA.BinaryTrees.BinaryTreeNode;

import static com.DSA.BinaryTrees.InputAndPrint.printLevelWise;

public class arrayToBST {

    public static BinaryTreeNode<Integer> makeBST(int[] arr, int si, int ei) {
        if (si > ei)   //base case: start index> end index
            return null;

        int mid = si + (ei-si)/2;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);
        root.left = makeBST(arr, si, mid - 1);
        root.right = makeBST(arr, mid + 1, ei);
        return root;
    }


    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 8, 9, 10,11};
        System.out.println("The array is: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        BinaryTreeNode<Integer> root = makeBST(arr, 0, arr.length - 1);
        System.out.println();
        printLevelWise(root);
    }
}
