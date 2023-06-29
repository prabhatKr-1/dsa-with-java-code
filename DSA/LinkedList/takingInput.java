package com.DSA.LinkedList;

import java.util.Scanner;

public class takingInput extends NodeUse {

//    3 functions for taking input are written below, The first one has O(n^2)
//    So I wrote the second one which has o(n).
//    The third one is the solution provided by the teacher which also has O(n)

    public static Node<Integer> takeInput() {
        Scanner scan = new Scanner(System.in);
        Node<Integer> head = null;
        int data = scan.nextInt();
        while (data != -1) {    //if -1 is entered, it means stop taking input
            Node<Integer> currentNode = new Node<>(data);
            if (head == null) {
                head = currentNode;     //make this as head node
            } else {
                Node<Integer> tail = head;
                while (tail.next != null) {     //find the last node
                    tail = tail.next;
                }
                tail.next = currentNode;       //current node after last node
            }

            data = scan.nextInt();
        }

        return head;
    }

    public static Node<Integer> takeInputBetter() {
        Scanner scan = new Scanner(System.in);
        Node<Integer> head = null;
        int data = scan.nextInt();
        if (data == -1)
            return head;
        else {
            head = new Node<>(data);
//            head = currentNode;     //make this as head node
        }
        Node<Integer> temp = head;
        data = scan.nextInt();
        while (data != -1) {    //if -1 is entered, it means stop taking input

            Node<Integer> currentNode = new Node<>(data);
            Node<Integer> tail = temp;
//            while (tail.next != null) {     //find the last node
//                tail = tail.next;
//            }
            tail.next = currentNode;       //current node after last node
            temp = temp.next;

            data = scan.nextInt();
        }

        return head;
    }

    public static Node<Integer> takeInputBest() {
        Scanner scan = new Scanner(System.in);
        Node<Integer> head = null, tail = null;
        int data = scan.nextInt();
        while (data != -1) {    //if -1 is entered, it means stop taking input
            Node<Integer> currentNode = new Node<>(data);
            if (head == null) {
                head = currentNode;     //make this as head node
                tail = currentNode;
            } else {
//                Node<Integer> tail = head;
//                while (tail.next != null) {     //find the last node
//                    tail = tail.next;
//                }
                tail.next = currentNode;       //current node after last node
                tail = tail.next;
            }

            data = scan.nextInt();
        }

        return head;
    }


    public static void main(String[] args) {

//        Node<Integer> head = CreateLinkedList();
        Node<Integer> head = takeInputBest();
        printLL(head);
    }
}
