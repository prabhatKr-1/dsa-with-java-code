package com.DSA.Trees;

import com.DSA.Queues.QueueEmptyException;
import com.DSA.Queues.QueueUsingLinkedList;

import java.util.Scanner;

public class InputAndPrint {
    public static TreeNode<Integer> takeInput(Scanner scan) {
        System.out.print("Enter next node data: ");
        int n = scan.nextInt();
        TreeNode<Integer> root = new TreeNode<>(n);
        System.out.print("Enter the no of children of " + n + ": ");
        int childrenNo = scan.nextInt();
        for (int i = 0; i < childrenNo; i++) {
            TreeNode<Integer> child = takeInput(scan);
            root.children.add(child);

        }
        return root;
    }

    public static TreeNode<Integer> takeInputLevelWise() {
        Scanner scan = new Scanner(System.in);  //we are not taking input here recursively hence we don't need to pass the scanner in the function argument
        System.out.print("Enter the root:");
        int rootData = scan.nextInt();
        QueueUsingLinkedList<TreeNode<Integer>> pendingNode = new QueueUsingLinkedList<>();
        TreeNode<Integer> root = new TreeNode<>(rootData);
        pendingNode.enqueue(root);
        while (!pendingNode.isEmpty()) {
            try {
                TreeNode<Integer> frontNode = pendingNode.dequeue();
                System.out.print("Enter the no of children of " + frontNode.data + ": ");
                int numChildren = scan.nextInt();
                for (int i = 0; i < numChildren; i++) {
                    System.out.print("Enter " + (i + 1) + "th child of " + frontNode.data + ": ");
                    int child = scan.nextInt();
                    TreeNode<Integer> childNode = new TreeNode<>(child);
                    frontNode.children.add(childNode);
                    pendingNode.enqueue(childNode);
                }


            } catch (QueueEmptyException e) {
//                It shouldn't come here as we have checked it in the while condition.
                return null;
            }


        }
        return root;
    }

    public static void print(TreeNode<Integer> root) {
        String s = root.data + ":";
        for (int i = 0; i < root.children.size(); i++) {
            s = s + root.children.get(i).data + ",";

        }
        System.out.println(s);
        for (int i = 0; i < root.children.size(); i++) {
            print(root.children.get(i));
        }


    }
    public static void printLevelWise(TreeNode<Integer> root) {
        QueueUsingLinkedList<TreeNode<Integer>> printQueue = new QueueUsingLinkedList<>();
        printQueue.enqueue(root);
        while (!printQueue.isEmpty()) {
            try {
                TreeNode<Integer> frontNode = printQueue.dequeue();
                System.out.print(frontNode.data + ":");
                for (int i = 0; i < frontNode.children.size(); i++) {
                    System.out.print(frontNode.children.get(i).data+",");
                    printQueue.enqueue(frontNode.children.get(i));
                }
                System.out.println();

            } catch (QueueEmptyException e) {
                return;
            }
        }


    }

    public static void printPreOrder(TreeNode<Integer>root){
        if(root==null)
            return;
        System.out.print(root.data+" ");
        for (int i = 0; i < root.children.size(); i++) {
            printPreOrder(root.children.get(i));

        }
    }

    public static void printPostOrder(TreeNode<Integer>root){
        if(root==null)
            return;
        for (int i = 0; i < root.children.size(); i++) {
            printPostOrder(root.children.get(i));

        }
        System.out.print(root.data+" ");



    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        TreeNode<Integer> root = takeInput(scan);
        TreeNode<Integer> root = takeInputLevelWise();
        print(root);
        printLevelWise(root);
        printPreOrder(root);
        printPostOrder(root);




//        TreeNode<Integer> root = new TreeNode<>(4);
//        TreeNode<Integer> node1 = new TreeNode<>(2);
//        root.children.add(node1);
//        TreeNode<Integer> node2 = new TreeNode<>(3);
//        root.children.add(node2);
//        TreeNode<Integer> node3 = new TreeNode<>(5);
//        root.children.add(node3);
//        TreeNode<Integer> node21 = new TreeNode<>(6);
//        node2.children.add(node21);
//        System.out.println(root);

    }
}
