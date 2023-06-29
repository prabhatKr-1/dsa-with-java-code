package com.DSA.BinaryTrees;
//Here while taking input recursively, we have taken a different approach as compared to the one in trees.

import com.DSA.Queues.QueueEmptyException;
import com.DSA.Queues.QueueUsingLinkedList;

import java.util.Scanner;

public class InputAndPrint {
    public static BinaryTreeNode<Integer> takeInputLevelWise() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the root: ");
        int rootData = scan.nextInt();
        if (rootData == -1)
            return null;
        QueueUsingLinkedList<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLinkedList<>();
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        pendingNodes.enqueue(root);
        while (!pendingNodes.isEmpty()) {
            try {
                BinaryTreeNode<Integer> frontNode = pendingNodes.dequeue();
                System.out.print("Enter the left child of " + frontNode.data + ": ");
                int leftChildData = scan.nextInt();
                if (leftChildData != -1) {
                    BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<>(leftChildData);
                    frontNode.left = leftChild;
                    pendingNodes.enqueue(leftChild);
                }

                System.out.print("Enter the right child of " + frontNode.data + ": ");
                int rightChildData = scan.nextInt();
                if (rightChildData != -1) {
                    BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<>(rightChildData);
                    frontNode.right = rightChild;
                    pendingNodes.enqueue(rightChild);
                }

            } catch (QueueEmptyException e) {
                return null;
            }
        }


        return root;
    }

    public static BinaryTreeNode<Integer> takeInput(Scanner scan) {
        System.out.print("Enter next node: ");
        int nextNode = scan.nextInt();
        if (nextNode == -1)
            return null;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(nextNode);
        root.left = takeInput(scan);
        root.right = takeInput(scan);
        return root;
    }

//    public static void printLevelWise(BinaryTreeNode<Integer> root) {
//        if (root == null)
//            return;
//        QueueUsingLinkedList<BinaryTreeNode<Integer>> printQueue = new QueueUsingLinkedList<>();
//        printQueue.enqueue(root);
//        while (!printQueue.isEmpty()) {
//            try {
//            BinaryTreeNode<Integer> frontNode = printQueue.dequeue();
//                frontNode = printQueue.dequeue();
//                String s = frontNode.data + ": ";
//                if (frontNode.left != null) {
//                    s = s + "L" + frontNode.left.data+",";
//                    printQueue.enqueue(frontNode.left);
//                }
//                if (frontNode.right != null) {
//                    s = s + "R" + frontNode.right.data;
//                    printQueue.enqueue(frontNode.right);
//                }
//                System.out.println(s);
//
//            } catch (QueueEmptyException e) {
//                return;
//            }
//        }
//    }


    public static void printLevelWise(BinaryTreeNode<Integer> root) {
//        if (root == null)
//            return;
        QueueUsingLinkedList<BinaryTreeNode<Integer>> printQueue = new QueueUsingLinkedList<>();
        printQueue.enqueue(root);
        while (!printQueue.isEmpty()) {
            try {
                BinaryTreeNode<Integer> frontNode = printQueue.dequeue();
                System.out.print(frontNode.data + ":");
                if (frontNode.left != null) {
                    System.out.print("L" + frontNode.left.data + ",");
                    printQueue.enqueue(frontNode.left);
                }
                if (frontNode.right != null) {
                    System.out.print("R" + frontNode.right.data);
                    printQueue.enqueue(frontNode.right);
                }
                System.out.println();

            } catch (QueueEmptyException e) {
                return;
            }
        }
    }

    public static void print(BinaryTreeNode<Integer> root) {
        if (root == null)   //this is a BASE CASE
            return;
        System.out.print(root.data + ":");      //sir has created a sting and printed it just like as in tree

        if (!(root.left == null)) {
            System.out.print("L" + root.left.data + ",");

        }
        if (!(root.right == null)) {
            System.out.print("R" + root.right.data);

        }
        System.out.println();
        print(root.left);       //even if it is null, base case will take care of it
        print(root.right);
    }

    public static void printInOrder(BinaryTreeNode<Integer> root) {

        if (root == null)
            return;
        printInOrder(root.left);
        System.out.print(root.data + " ");
        printInOrder(root.right);

    }

    public static void printPreOrder(BinaryTreeNode<Integer> root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    public static void printPostOrder(BinaryTreeNode<Integer> root) {
        if (root == null)
            return;
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.data+" ");



    }

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        BinaryTreeNode<Integer> root = takeInput(scan);
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        print(root);
        System.out.println();
        printLevelWise(root);
        System.out.println();
        printInOrder(root);
    }
}
