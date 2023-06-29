//ArrayList is an inbuilt data structure similar to dynamic array
//Whenever an element is removed or inserted, the entire list gets shifted
package com.DSA;
import java.util.ArrayList;     //we have to import it first

public class Array_List {
    public static void main(String[] args) {
//  The default capacity is 10, but we can specify if we want
//  When the arraylist gets full, a new one is created having 1.5x the capacity

        ArrayList<Integer> arr = new ArrayList<>(20);
        arr.add(10);    //adding element to the array list
        arr.add(20);
        arr.add(40);
        arr.add(40);

        System.out.println(arr.get(2));     //accessing elements by index
        arr.add(2, 30);          //inserting element by index
        //      But we can only do this to the index<=current last index

        System.out.println(arr.get(2));
        System.out.println(arr.size());

        arr.remove(2);      //removes element at that index
        Integer i = 10;
        arr.remove(i);      //will remove i from the list

        System.out.println(arr.get(2));
        System.out.println(arr.size());     //prints the size,not capacity
//      size is the no of elements currently stored.
//      Enhanced for loop.
        for (int j : arr) {        //here j in not index but the element itself
            System.out.print(j + " ");
        }

    }

}
