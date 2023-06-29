//Reverse the given LL using recursion.
//My function has time complexity of O(n^2)
//The other one has of O(n)
package com.DSA.LinkedList;

public class reverseLL extends takingInput {

    public static Node<Integer> reverseRecursivelyByMe(Node<Integer> head) {
        if(length(head)==0)
            return null;
        if (head.next == null)
            return head;
        else {
            Node<Integer> temp = head;
            head = reverseRecursively(head.next);
            Node<Integer> temp2 = head;
            while (temp2.next != null) {
                temp2 = temp2.next;
            }
            temp2.next = temp;
            temp.next = null;
            return head;
        }
    }

    public static Node<Integer> reverseRecursively(Node<Integer> head){
        if(head ==null || head.next==null){
            return head;
        }
        Node<Integer> smallHead = reverseRecursively(head.next);
        head.next.next=head;
        head.next=null;

        return smallHead;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInputBest();
        printLL(head);
        System.out.println("\nThe reversed Linked List is:");
        head = reverseRecursively(head);
        printLL(head);
    }
}
