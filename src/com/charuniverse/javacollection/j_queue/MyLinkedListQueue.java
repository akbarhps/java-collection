package com.charuniverse.javacollection.j_queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MyLinkedListQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>(
                List.of("Hasadi", "Siregar", "Akbar", "Putra")
        );

        System.out.println(queue);
        // output: [Hasadi, Siregar, Akbar, Putra]

        // menghapus elemen pertama dan return nilainya
        System.out.println(queue.poll());
        // output: Hasadi

        System.out.println(queue.size());
        // output: 3
    }
}
