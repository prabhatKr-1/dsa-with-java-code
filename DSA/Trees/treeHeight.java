package com.DSA.Trees;

public class treeHeight extends InputAndPrint {

    public static int height(TreeNode<Integer> root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int height = 1;
        int bigChildHeight = 0;
        for (int i = 0; i < root.children.size(); i++) {
            int childHeight = height(root.children.get(i));
            if (childHeight > bigChildHeight)
                bigChildHeight = childHeight;

        }
        return bigChildHeight+height;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInputLevelWise();
        System.out.println(height(root));
    }
}
