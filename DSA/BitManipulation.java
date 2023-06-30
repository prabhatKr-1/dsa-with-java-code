package com.DSA;

public class BitManipulation {
    public static void main(String[] args) {
//        Get bit operation
        int n = 5;
        System.out.println("The value of n is: "+n);
        int i = 2; //tell the bit at 2nd position
        //method
        int bitMask = 1<<i;
        int operation = bitMask & n;
        if(operation == 0){
            System.out.println("The bit is zero!");
        }else{
            System.out.println("The bit is one!");
        }

//        Set Bit Operation
            //here the bitmask is same, the operation used is or
        int newNumber = n | bitMask;
        System.out.println(newNumber);
//        Unset bit
        //here the bit mask is same, but the AND operation is performed with the not(~) of the bitmask
        int newNumber2 = n & (~(bitMask));
        System.out.println(newNumber2);

//        Odd or even
        int p = 5;
        if((p & 1) ==0){
            System.out.println(p+" is even!");
        }else {
            System.out.println(p+" id odd");
        }

    }
}
