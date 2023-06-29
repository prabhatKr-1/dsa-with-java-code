package com.Strings;

import java.util.Scanner;

public class PalindromeInStrings {
    public static boolean isPalindrome(String s) {
        int length= s.length();
        for (int i = 0; i < length; i++) {
            if(s.charAt(i)!=s.charAt(length-1-i)){
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        sc.close();
        boolean result = isPalindrome(s);
        System.out.print(result);

    }
}
