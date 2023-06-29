//Print all the nodes present at a depth = k
package com.DSA.Trees;

import java.util.Scanner;

public class NodeDepth extends InputAndPrint {
    public static void printAtDepth(TreeNode<Integer> root, int depth) {
        if (root == null || depth<0) {
            return;
        }
        if (depth == 0) {       //base case
            System.out.print(root.data+" ");
        } else {
            for (int i = 0; i < root.children.size(); i++) {
                printAtDepth(root.children.get(i),depth-1);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInputLevelWise();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the depth: ");
        int depth = scan.nextInt();
        printAtDepth(root, depth);
    }

}
