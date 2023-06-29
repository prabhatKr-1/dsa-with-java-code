//Search if a node is present or not. Return the index if present else return -1
//Check there is an inbuilt function too which is used in the 2nd function.
package com.DSA.LinkedList;

import java.util.Scanner;

public class find_Node extends takingInput {

    public static int findNodeByMe(Node<Integer> head, int element) {
        if (head == null)
            return -1;
        for (int i = 0; i < length(head); i++) {
            if (head.data == element) {
                return i;
            } else {
                head = head.next;
            }
        }

        return -1;
    }

    public static int findNode(Node<Integer> head, int element) {
        if (head == null)
            return -1;
        int i = 0;
        while (head != null) {
            if (head.data.equals(element)) {
                return i;
            }
            head = head.next;
            i++;
        }

        return -1;
    }


    public static void main(String[] args) {
        Node<Integer> head = takeInputBest();
        printLLRecursively(head);
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter the node to search: ");
        int element = scan.nextInt();
//        int ans = findNodeByMe(head, element);
        int ans = findNode(head, element);
        System.out.println(ans);
    }

}
