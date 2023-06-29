package com.DSA.Stack;

import java.util.Stack;

public class reverse_Stack {
    public static void reverseStack(Stack<Integer> stack, Stack<Integer> extra) {
        if(stack.size()<=1) //base case: if stack has zero or one element, it is already reversed
            return;
        int top = stack.pop();  //keeping the top and sending the rest in recursion
        reverseStack(stack,extra);  //using recursion to reverse the rest of the stack
        while (!stack.isEmpty()){   //arranging the recursively reversed stack in extra so that we can merge it with the top and place it in the original stack
            extra.push(stack.pop());
        }
        extra.push(top);    //top goes to bottom
        while (!extra.isEmpty()){   //rest of the elements follow
            stack.push(extra.pop());
        }

    }

    public static void main(String[] args) {

        int[] a ={1,2,5,4,8,6,};
        Stack<Integer> stack = new Stack<>();
        for(int ele: a){
            stack.push(ele);
        }
        Stack<Integer> extra = new Stack<>();
        reverseStack(stack,extra);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}
