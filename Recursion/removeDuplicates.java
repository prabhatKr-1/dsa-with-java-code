//Remove consecutive duplicates characters
package com.Recursion;

import java.util.Scanner;

public class removeDuplicates {

    public static String removeDuplicate(String str){
        if(str.length()<=1)
            return str;
        String ans = "";
        if(str.charAt(0)!=str.charAt(1))
            ans = ans + str.charAt(0);

        String smallAns = removeDuplicate(str.substring(1));
        return ans+ smallAns;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String str= scan.nextLine();
        String ans = removeDuplicate(str);
        System.out.print("The name after removing duplicates: ");
        System.out.print(ans);
    }
}
