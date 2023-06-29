package com.Strings;

import java.util.Scanner;

public class Reverse_string_wordwise {
    public static String reverseItWbw(String str) {
        String newStr = "";
        int i = str.length() - 1;
        int j = str.length();
        while (i >= 0) {
            if (str.charAt(i) == ' ') {
                //i+1 because chat at i is space and we need the char after space
                newStr = newStr.concat(str.substring(i + 1, j)) + " ";
                j = i;          //so that j correspends to the end of the next word
            }
            i--;

        }

        newStr = newStr + str.substring(i + 1, j);       //adding the first word
        return newStr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the statement:");
        String s = sc.nextLine();
        s = reverseItWbw(s);
        System.out.print(s);
    }
}
