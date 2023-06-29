package com.DSA.LinkedList;

public class mergeSort_LL extends merger2sortedLL{

    public static Node<Integer> mergeSort(Node<Integer> head){
        if(head==null || head.next==null){
            return head;
        }
        Node<Integer> mid = findMid(head);
        Node<Integer> half1 = head;
        Node<Integer> half2 = mid.next;
        mid.next=null;

        half1 = mergeSort(half1);
        half2   = mergeSort(half2);

        Node<Integer> finalNOde = mergeLLbyMe(half1,half2);
        return finalNOde;

    }

    public static void main(String[] args) {
        System.out.println("Enter the list:");
        Node<Integer> head = takeInputBest();

        printLL(head);
        System.out.println();
        System.out.println("The sorted list is: ");
        Node<Integer> sorted = mergeSort(head);

        printLL(sorted);

    }

}
