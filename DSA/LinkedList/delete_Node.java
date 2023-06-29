package com.DSA.LinkedList;

import java.util.Scanner;

public class delete_Node extends takingInput {

    public static Node<Integer> deleteNode(Node<Integer> head, int position) {
        Node<Integer> temp = head;
        if (position >= length(head)) {
            System.out.print("No such node exists!\n");
            return head;
        }
        if (position == 0) {
            head = head.next;
            temp.next = null;
            return head;
        }

        for (int j = 0; j < position - 1; j++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;


        return head;
    }

    public static Node<Integer> deleteNodeRecursively(Node<Integer> head, int position) {
        if (position >= length(head)) {
            System.out.print("No such node exists!\n");
            return head;
        }
        Node<Integer> temp = head;
        if (position == 0) {
            head = head.next;
            temp.next = null;
            return head;
        } else {
            head.next = deleteNodeRecursively(head.next, position - 1);
            return head;

        }
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInputBest();
        printLL(head);
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter the node no to remove: ");
        int position = scan.nextInt();
//        head = deleteNode(head, position);
        head = deleteNodeRecursively(head, position);
        printLL(head);
    }
}
