package com.DSA.Stack;

public class stackUse {
    public static void main(String[] args) throws StackEmptyException {
//       StackUsingArray stack = new StackUsingArray();
        StackUsingLL<Integer> stack = new StackUsingLL<>();
       for (int i = 0; i < 10; i++) {
          stack.push(i);
       }
       System.out.println(stack.pop());
       System.out.println(stack.top());
       System.out.println(stack.size());
       System.out.println(stack.pop());
       System.out.println(stack.pop());
       System.out.println(stack.size());



    }
}