//Replace all the given characters of a string with another given character
package com.Recursion;

import java.util.Scanner;

public class replaceChars {

    public static String replaceChar(String str, char  oldChar,char  newChar){
        if(str.length()==0)
            return str;
        String ans="";
        if(str.charAt(0)==oldChar)
            ans = ans + newChar;
        else
            ans = ans + str.charAt(0);

        String smallAns = replaceChar(str.substring(1),oldChar,newChar);
        return ans+ smallAns;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str= scan.nextLine();
        System.out.print("Enter the character you want to replace: ");
        char oldChar = scan.next().charAt(0);
        System.out.print("Enter the new character: ");
        char newChar= scan.next().charAt(0);
        scan.close();
        String ans = replaceChar(str,oldChar,newChar);
        System.out.print(ans);
    }
}
