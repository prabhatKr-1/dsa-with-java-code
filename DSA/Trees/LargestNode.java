package com.DSA.Trees;

public class LargestNode extends InputAndPrint{
    public static int largestNode(TreeNode<Integer>root){
        if(root==null)      //again not a base case
            return Integer.MIN_VALUE;   //if no nodes are present return (-infinity)
        int largest;
        largest= root.data;
        for (int i = 0; i < root.children.size(); i++) {
            int largestChild= largestNode(root.children.get(i));
            if(largestChild>largest){
                largest=largestChild;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInputLevelWise();
        System.out.println(largestNode(root));
    }
}
