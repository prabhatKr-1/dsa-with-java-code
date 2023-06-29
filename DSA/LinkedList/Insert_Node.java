//Insert a node in the linked list and arrange the rest of the LL accordingly
package com.DSA.LinkedList;

import java.util.Scanner;

public class Insert_Node extends takingInput {

    public static Node<Integer> InsertNode(Node<Integer> head, int position, int data) {
        Node<Integer> temp = head;
        Node<Integer> newNode = new Node<>(data);
        if (position == 0) {
            newNode.next = temp;
            temp = newNode;
            return temp;
        }
        if (position > length(head)) {
            System.out.println("Invalid Position!");
            return head;
        }
        for (int j = 0; j < position - 1; j++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public static Node<Integer> InsertNodeRecursively(Node<Integer> head, int position, int data) {
        Node<Integer> temp = head;
        if (position >= length(head))
            return head;
        if (position == 0) {
            Node<Integer> newNode = new Node<>(data);
            newNode.next = temp;
            temp = newNode;
            return temp;
        } else
            temp = InsertNodeRecursively(temp.next, position - 1, data);
        head.next = temp;
        /*This code is same as
         *head.next =InsertNodeRecursively(temp.next, position - 1, data);
         * return head;
         *  */
        return head;
    }

    public static void main(String[] args) {
        System.out.println("Enter the Linked List:");
        Node<Integer> head = takeInputBest();
        printLL(head);
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter position and data: ");
        int position = scan.nextInt();
        int data = scan.nextInt();
//        head = InsertNode(head,position,data);
        head = InsertNodeRecursively(head, position, data);
        printLL(head);
    }

}
