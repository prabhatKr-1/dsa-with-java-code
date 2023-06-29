package com.DSA.BinaryTrees;

//Mirror a given binary tree
public class mirror extends InputAndPrint {
//    Here the return type is void because we are not making any changes in the reference of root node, hence we don't need to return it. We need to return something only when the function has affected the base address's reference in any way.
    public static void mirrorTree(BinaryTreeNode<Integer> root) {
        if (root == null)
            return ;
        mirrorTree(root.left);
         mirrorTree(root.right);
        BinaryTreeNode<Integer> temp = root.left;
        root.left = root.right;
        root.right = temp;
//        return ;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        System.out.println("The original tree: ");
        printLevelWise(root);
        System.out.println("The mirror image is: ");
        mirrorTree(root);
        printLevelWise(root);
    }




}
