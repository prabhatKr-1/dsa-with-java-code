//Remove all the X's from the given string
package com.Recursion;

public class removeX {

    public static String removeXs(String str) {
        if (str.length() == 0)
            return str;
        String ans = "";
        if (str.charAt(0) != 'x' && str.charAt(0) != 'X') {
            ans = ans + str.charAt(0);
        }

        String smallAns = removeXs(str.substring(1));
        return ans + smallAns;
    }

    public static void main(String[] args) {
        String ques = "abcXpx";
        System.out.print(removeXs(ques));
//        System.out.print(ans);
    }
}

