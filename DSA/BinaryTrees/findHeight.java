package com.DSA.BinaryTrees;

public class findHeight extends InputAndPrint {
    public static int height(BinaryTreeNode<Integer> root) {
        if (root == null)
            return 0;
        int length = 1;
        int leftHeight= height(root.left);
        int rightHeight= height(root.right);
        return length+Math.max(leftHeight,rightHeight);

    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        System.out.println("The height is: " + height(root));
    }
}
