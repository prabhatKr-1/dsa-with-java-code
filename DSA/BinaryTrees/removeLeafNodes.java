package com.DSA.BinaryTrees;

//Remove all the leaf nodes from a given tree
public class removeLeafNodes extends InputAndPrint {
    public static BinaryTreeNode<Integer> removeLeaf(BinaryTreeNode<Integer> root) {
        if (root==null || (root.left == null && root.right == null)) {
            return null;
        }
        if(root.left!=null) {
            root.left = removeLeaf(root.left);
        }
        if(root.right!=null) {
            root.right = removeLeaf(root.right);
        }


        return root;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        printLevelWise(root);
        System.out.println("The tree after removing the leaf nodes:");
        root = removeLeaf(root);
        printLevelWise(root);
    }
}
