package com.DSA.Arrays;

public class DynamicArrayUse {
    public static void main(String[] args) {
        DynamicArray d= new DynamicArray();
        d.add(5);
        d.add(5);
        d.add(4);
        d.add(2);
        d.add(0);
        d.add(1);
        d.set(1,6);
        d.removeLast();
        System.out.println(d.get(0));
        System.out.println(d.get(1));
        System.out.println(d.get(2));
        System.out.println(d.get(3));
        System.out.println(d.getNextIndex());
        System.out.println(d.isEmpty());
    }
}
