package com.OOPs.Generics;

public class Print {
    public static <T> void print(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
    //Can't use primitive data types here also
        Integer[] a = {1, 2, 3, 4, 5};
        print(a);
        Double[] ab = {1.2, 0.2, 3.4, 0.4, 5.0};
        print(ab);


    }

}
