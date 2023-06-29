//Stack using Java Collections Framework, the inbuilt stack
package com.DSA.Stack;

import java.util.Stack;

public class collectionsStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        System.out.println(stack.size());
        System.out.println(stack.peek());   //displays the top element
//        System.out.println(stack.top()); top() not present in collections
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        stack.push(20);
        stack.push(20);
        stack.push(20);
        System.out.println(stack.size());
    }
}
