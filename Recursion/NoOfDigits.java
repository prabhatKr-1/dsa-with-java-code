package com.Recursion;

import java.util.Scanner;

public class NoOfDigits {
    public static int noOfDigits(int n){
        if(n/10==0)
            return 1;
        else
            return noOfDigits(n/10) + 1;



    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int n= scan.nextInt();
        scan.close();
        int no= noOfDigits(n);
        System.out.print("The no of digits: "+no);
    }
}
