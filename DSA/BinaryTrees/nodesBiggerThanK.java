package com.DSA.BinaryTrees;

import java.util.Scanner;

//Find the no of nodes larger than the given number
public class nodesBiggerThanK extends InputAndPrint {
    public static int biggerThanK(BinaryTreeNode<Integer> root, int k) {
        if (root == null)
            return 0;
        int count = 0;
        if (root.data > k)
            count++;
        count+=biggerThanK(root.left,k);
        count+=biggerThanK(root.right,k);

        return count;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int k = scan.nextInt();
        System.out.print("The no of nodes grater than "
                + k + " are: "
                + biggerThanK(root, k));
    }

}
