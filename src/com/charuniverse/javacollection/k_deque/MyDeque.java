package com.charuniverse.javacollection.k_deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class MyDeque {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>(
                List.of("Hasadi", "Putra", "Siregar")
        );
        stack.offerFirst("Akbar");

        System.out.println(stack);
        // output: [Akbar, Hasadi, Siregar, Putra]

        System.out.println(stack.pollLast());
        // output: Akbar

        System.out.println(stack.pollFirst());
        // output: Hasadi

        System.out.println(stack.size());
        // output: 2
    }
}