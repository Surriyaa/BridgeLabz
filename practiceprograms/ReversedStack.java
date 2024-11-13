package com.practiceprograms;

import java.util.Stack;

public class ReversedStack {

    // Function to reverse the stack
    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        // Pop the top element
        int top = stack.pop();

        // Recursively reverse the remaining stack
        reverseStack(stack);

        // Insert the popped element at the bottom of the reversed stack
        insertAtBottom(stack, top);
    }

    // Helper function to insert an element at the bottom of the stack
    public static void insertAtBottom(Stack<Integer> stack, int element) {
        if (stack.isEmpty()) {
            stack.push(element);
            return;
        }

        // Pop the top element
        int top = stack.pop();

        // Recursively insert the element at the bottom
        insertAtBottom(stack, element);

        // Push the previously popped element back
        stack.push(top);
    }

    // Main method for testing
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Original Stack: " + stack);
        reverseStack(stack);
        System.out.println("Reversed Stack: " + stack);
    }
}
