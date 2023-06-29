package com.OOPs.Generics;

public class PairUse {
    Pair<String, String> p1 = new Pair<String, String>("lucky", "singh");
    String a = p1.getSecond();

    //    We can't use primitive data types on generics, instead we use superficial
//    object of a class


    Pair<Integer, String> p2 = new Pair<>(1, "2");
    Integer in = p2.getFirst();

    Pair<Character, Character> p3 = new Pair<>('a', 'b');
    Character pq = p3.getSecond();
    //    Similarly, we use Boolean for boolean

//    We can do something more interesting as well
//    We can create a pair where first and second are a pairs themselves
    Pair<Integer,Integer> integerIntegerPair = new Pair<>(1,3);
    Pair<Pair<Integer,Integer>,String> p4= new Pair<>(integerIntegerPair,"hi");




    public static void main(String[] args) {
//        System.out.println(a);
//        System.out.println(in);
    }
}
