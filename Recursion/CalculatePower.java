package com.Recursion;

import java.util.Scanner;

public class CalculatePower {
    public static double power(int n, int pow) {
        if(pow==0)
            return 1;
        if (pow == 1 )
            return n;
        else
            return power(n, pow - 1) * n;

    }

    public static void main(String[] args) {
        boolean isPositive= true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int n = sc.nextInt();
        System.out.print("Enter the power: ");
        int pow = sc.nextInt();
        sc.close();
        if (pow<0) {
            isPositive=false;
            pow*=-1;
        }
        double result = power(n, pow);
        if(isPositive)
        System.out.print("The result is: "+result);
        else
            System.out.print("The result is: "+1/result);
    }
}
