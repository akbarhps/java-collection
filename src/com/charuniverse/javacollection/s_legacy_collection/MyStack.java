package com.charuniverse.javacollection.s_legacy_collection;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Akbar");
        stack.push("Hasadi");
        stack.push("Putra");
        stack.pop();
        System.out.println(stack);
        // output: [Akbar, Hasadi]
    }
}