package com.DSA.LinkedList;

import java.util.LinkedList;

public class collectionsLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10); //adds node in the list
        list.add(20);
        list.add(2,5);      //insert at (index,element)
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();
        System.out.println(list.get(0));
        list.addFirst(20);      //adds at the start of the list
        list.addLast(50);
        list.set(1,10);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();
        System.out.println(list.size());
        list.remove();      //removes the first element by default
        list.remove(3); // index and value both are allowed
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();


    }

}
