package com.DSA.LinkedList;

public class NodeUse {
    public static Node<Integer> CreateLinkedList() {
        Node<Integer> n1 = new Node<>(1);
        Node<Integer> n2 = new Node<>(2);
        n1.next = n2;
        Node<Integer> n3 = new Node<>(3);
        n2.next = n3;
        Node<Integer> n4 = new Node<>(4);
        n3.next = n4;
        return n1;
    }

    public static int length(Node<Integer> head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    public static void printLL(Node<Integer> head) {

        Node<Integer> temp = head;//so that we can reuse head
        while (temp != null) {
//            temp.data++;
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

    public static void printLLRecursively(Node<Integer> head){
        if(head == null)
            return;
        System.out.print(head.data+" ");
        printLLRecursively(head.next);

    }


    public static void main(String[] args) {

//        Node<Integer> head = CreateLinkedList();
        Node<Integer> head = CreateLinkedList();
//        printLL(head);
        printLLRecursively(head);

       /* Node<Integer> n1= new Node<>(2);
        System.out.println(n1); //stores address of n1 node
        System.out.println(n1.data);
        System.out.println(n1.next);*/
    }
}
