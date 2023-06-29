//We won't be doing it as we did in merging two sorted arrays.
//We won't create a separate list to store them, instead we will make the nodes point to the correct node.
package com.DSA.LinkedList;

public class merger2sortedLL extends midPoint {

    public static Node<Integer> mergeLL(Node<Integer> head1, Node<Integer> head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        Node<Integer> t1 = head1, t2 = head2;
        Node<Integer> head = null, tail = null;
        if (t1.data <= t2.data) {
            head = t1;
            tail = t1;
            t1 = t1.next;
        } else {
            head = t2;
            tail = t2;
            t1 = t2.next;
        }

        while (t1 != null && t2 != null) {
            if (t1.data <= t2.data) {
                tail.next = t1;
                tail = t1;
                t1 = t1.next;
            } else {
                tail.next = t2;
                tail = t2;
                t2 = t2.next;
            }
        }
//      One list is over at this point, so we will just append the remaining one
        if (t1 != null) {
            tail.next = t1;
        } else {
            tail.next = t2;
        }

        return head;
    }


    public static Node<Integer> mergeLLbyMe(Node<Integer> head1, Node<Integer> head2) {
        if (head1 == null)
            return head2;
        if (head2 == null) {
            return head1;
        }
        Node<Integer> merged;

        int length = length(head1) + length(head2), i = 0;
        if (head1.data <= head2.data) {
            merged = head1;
            head1 = head1.next;
            merged.next = null;
        } else {
            merged = head2;
            head2 = head2.next;
            merged.next = null;
        }
        Node<Integer> tail = merged;
        while (i < length - 1) {
            if (head1 == null) {
                tail.next = head2;
                break;
            }
            if (head2 == null) {
                tail.next = head1;
                break;
            }
            if (head1.data <= head2.data) {  //if I used <=, I am getting error. Idk why
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
            tail.next = null;
            i++;
        }

        return merged;
    }

    public static void main(String[] args) {
        System.out.println("Enter the first sorted list:");
        Node<Integer> head1 = takeInputBest();
        System.out.println("Enter the second sorted list:");
        Node<Integer> head2 = takeInputBest();
        printLL(head1);
        System.out.println();
        printLL(head2);
        System.out.println();
        Node<Integer> merged = mergeLLbyMe(head1, head2);
//        Node<Integer> merged = mergeLL(head1, head2);
        printLL(merged);

    }
}
