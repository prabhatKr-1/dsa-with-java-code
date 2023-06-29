//Find no of nodes
package com.DSA.Trees;

public class numNodes extends InputAndPrint {
    public static int numOfNodes(TreeNode<Integer> root) {
        if(root==null)      //this is not a base case
            return 0;
        int count=1;
        for (int i = 0; i < root.children.size(); i++) {
            count+= numOfNodes(root.children.get(i));
        }
        return count;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInputLevelWise();
        System.out.println(numOfNodes(root));
    }
}
