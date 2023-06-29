//Find mid-point of a liked list without using the length() function
//We will be using a different approach which is used in many problems.
//We will initiate two references, slow and fast. Slow will cover one element in one time while fast will cover two elements in the same amount of time.
//When fast is at the end of the list, slow will be at the mid of the list.
package com.DSA.LinkedList;

public class midPoint extends takingInput {

    public static Node<Integer> findMid(Node<Integer> head) {
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while (fast.next != null && fast.next.next != null) { //only correct sequence
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public static void main(String[] args) {
        Node<Integer> head = takeInputBest();
        printLL(head);
        Node<Integer> mid =  findMid(head);
        System.out.println("");
        System.out.print("The mid node is: "+mid.data);
    }
}
