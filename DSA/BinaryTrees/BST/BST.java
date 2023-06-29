package com.DSA.BinaryTrees.BST;

import com.DSA.BinaryTrees.BinaryTreeNode;

public class BST {
    private BinaryTreeNode<Integer> root;
    private int size;

    private static boolean isPresentHelper(BinaryTreeNode<Integer> node, int data) {
        if (node == null)
            return false;
        if (node.data == data)
            return true;
        else if (node.data > data) {
            return isPresentHelper(node.left, data);
        } else {
            return isPresentHelper(node.right, data);
        }
    }

    public boolean isPresent(int data) {
//        As only one argument is provided here, and we are accustomed to two parameters while doing these type of operations, we will use a helper function
        return isPresentHelper(root, data);
//      isPresentHelper() function is made static because it is independent of the object as we are not getting the root as a parameter in the isPresent function. Irrespective of the object, we are always working on the same root everytime, so it is object independent. Hence, we made it a static function.
    }

    private BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer> node, int data) {
        if (node == null) { //when no nodes are present
            BinaryTreeNode<Integer> newRoot = new BinaryTreeNode<>(data);
            return newRoot;
        } else if (node.data <= data) {
            node.right = insert(node.right, data);
        } else {
            node.left = insert(node.left, data);
        }

        return node;
    }

    public void insert(int data) {
        root = insert(root, data);      //because we have to use recursion
        size++;
    }

    public static BSTDeleteReturns deleteDataHelper(BinaryTreeNode<Integer> root, int x) {
        if (root == null) {
            return new BSTDeleteReturns(null, false);
        }
        if (root.data < x) {
            BSTDeleteReturns outputRight = deleteDataHelper(root.right, x);
            root.right = outputRight.root;
            outputRight.root = root;
            return outputRight;
        }
        if (root.data > x) {
            BSTDeleteReturns outputLeft = deleteDataHelper(root.left, x);
            root.left = outputLeft.root;
            outputLeft.root = root;
            return outputLeft;
        }

        //no children
        if (root.left == null && root.right == null) {
            return new BSTDeleteReturns(null, true);
        }
        //only left child
        if (root.left != null && root.right == null) {
            return new BSTDeleteReturns(root.left, true);
        }
        //only right child
        if (root.left == null && root.right!= null) {
            return new BSTDeleteReturns(root.right, true);
        }
        //both children present
        int rightMin = smallest(root.right);
        root.data = rightMin;
        BSTDeleteReturns outputRight = deleteDataHelper(root.right, rightMin);
        root.right = outputRight.root;
        return new BSTDeleteReturns(root, true);
    }

    private static int smallest(BinaryTreeNode<Integer> root) {
        if (root == null)
            return Integer.MAX_VALUE;
        int smallestLeft = smallest(root.left);
        int smallestRight = smallest(root.right);
        return Math.min(root.data, Math.min(smallestLeft, smallestRight));

    }

    public boolean deleteData(int x) {    //if the element is present then delete and return true else return false
        BSTDeleteReturns output = deleteDataHelper(root, x);
        root = output.root;
        if (output.deleted)
            size--;
        return output.deleted;
    }

    public int size() {
        return size;
    }

    public void printTree() {
        printTreeHelper(root);
    }

    private static void printTreeHelper(BinaryTreeNode<Integer> node) {
        if (node == null)
            return;
        System.out.print(node.data + ": ");
        if (node.left != null) {
            System.out.print("L" + node.left.data + " ");
        }
        if (node.right != null) {
            System.out.print("R" + node.right.data);
        }
        System.out.println();
        printTreeHelper(node.left);
        printTreeHelper(node.right);
    }
}
