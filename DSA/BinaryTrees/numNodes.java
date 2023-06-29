package com.DSA.BinaryTrees;
//Find the no of nodes in a given binary tree
public class numNodes extends InputAndPrint{
    public static int numOfNodes(BinaryTreeNode<Integer>root){
        if(root==null)      //base case, we are reaching here with recursion
            return 0;
        int count=1;
        count+= numOfNodes(root.left);
        count+= numOfNodes(root.right);

        return count;
    }



    public static void main(String[] args) {
        BinaryTreeNode<Integer> root= takeInputLevelWise();
        System.out.println("The no of nodes is: "+numOfNodes(root));
    }
}
