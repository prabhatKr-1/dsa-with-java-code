package com.DSA.BinaryTrees;

public class sumOfNodes extends InputAndPrint {
    public static int nodesSum(BinaryTreeNode<Integer> root) {
        if (root == null)   //base case
            return 0;

        int sum=root.data;
        sum+=nodesSum(root.left);
        sum+=nodesSum(root.right);
        return sum;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        System.out.println("The sum of all the nodes is: "+nodesSum(root));
    }
}
