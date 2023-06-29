//Strings in java are immutable. We can't go at an index and change its value.
/*Strings are stored in string pools. Character array is created and the string is
 * stored in it. But if we want to create another string and the content is same,then
 * most probably new character array won't be created and the new string obj. will
 * point to the earlier character array.
 * eg: String a="hello";  --> character array is created in the pool
 *     String b="hello";  --> here b won't get its own space in the pool and will
 *  point to the character array of string a. This is why strings are immutable
 *  a==b will most likely return true. But if you create two arrays with the same content
 * and compare them, the result will be false as it will compare the addresses.
 * */
package com.Strings;

public class string {
    public static void main(String[] args) {
        String name = "prabhat";
        System.out.println(name.length());  //() are used in strings unlike arays
        System.out.println(name.charAt(0)); //name[0] not valid in java
        System.out.println(name.substring(0, name.length())); //the end index in not included
        System.out.println(name.substring(2)); //will print from starting index to end
        System.out.println(name.contains("prabt")); //checks if it is present in the string or not
        System.out.println(name.concat(" kumar"));
        String two="prabhat";
        if(name==two){         //try the same for arrays
            System.out.println("Equal");
        }
        else System.out.println("unequal");
//        Better method because string optimisation in the pool isn't guaranteed!
        if(name.equals(two))
            System.out.println("Equal");
        else System.out.println("unequal");

    }

}
