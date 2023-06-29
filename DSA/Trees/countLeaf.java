//Find the no of leafs in a tree.
//Leaf: node without any child
package com.DSA.Trees;

public class countLeaf extends InputAndPrint {

    public static int numLeaf(TreeNode<Integer> root) {
        if (root == null)      //not a base case
            return -1;
        int count = 0;
        if (root.children.size() == 0)     //base case
            count++;
        for (int i = 0; i < root.children.size(); i++) {
            int childCount = numLeaf(root.children.get(i));
            count += childCount;
        }


        return count;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInputLevelWise();
        int count = numLeaf(root);
        System.out.println("The no of leaves is: " + count);
    }

}
