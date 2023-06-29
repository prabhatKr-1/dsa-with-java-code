package com.Recursion;
import java.util.Scanner;
public class Factorial {
    public static int fact(int n) {
        if (n == 0)         //Base case
            return 1;
        else
            return n * fact(n - 1); //calculation and smaller problem
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no whose factorial you want to calculate: ");
        int n= sc.nextInt();
        int result=fact(n);
        System.out.print("Factorial is: "+result);

    }
}
