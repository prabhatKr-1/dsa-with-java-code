//This code is working for all the few test cases I had but the solution provided by Ankush Sir is very different. So check those three videos.

package com.DSA.BinaryTrees.BST;
//Check if the given is a Binary Search Tree or not

import com.DSA.BinaryTrees.BinaryTreeNode;
import com.DSA.BinaryTrees.InputAndPrint;

public class isBST extends InputAndPrint {

    public static boolean is_BST(BinaryTreeNode<Integer> root) {
        if (root == null)
            return true;
        if (root.left != null && root.data < root.left.data)
            return false;
        if (root.right != null && root.data > root.right.data)
            return false;

        boolean leftAns = is_BST(root.left);
        boolean rightAns = is_BST(root.right);
        return (leftAns && rightAns);
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        printLevelWise(root);
        boolean ans = is_BST(root);
        System.out.print("Is the given true a BST: " + ans);
    }
}
