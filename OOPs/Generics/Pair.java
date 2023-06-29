package com.OOPs.Generics;

//public class Pair<T>{     //when we want the pair of different data types then:
public class Pair<T,V> {    //now T and V can be of different datatype
    private T first;
    private V second;
    public Pair(T first, V second){
        this.first=first;
        this.second=second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }
}
