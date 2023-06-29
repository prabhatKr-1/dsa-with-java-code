package com.Recursion;

import java.util.Scanner;

public class printNo {

    public static void printNos(int n,int start){
        if(start==n){
            System.out.print(n);
            return;}
        else{
            System.out.print(start+" ");
            printNos(n,start+1);
    }}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your no: ");
        int n = scan.nextInt();
        scan.close();
        printNos(n,1);


    }
}
