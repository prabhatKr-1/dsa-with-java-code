package com.OOPs;

public class ComplexUse {
    public static void main(String[] args) {
        ComplexNos c1= new ComplexNos(1,2);
        ComplexNos c2 = new ComplexNos(2,3);
        c1.print();
        c2.print();
//        c1.conjugate();
//        c1.print();
        c1.mutliply(c2);
        c1.print();
    }
}
