package com.charuniverse.javacollection.j_queue;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyPriorityQueue {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>(
                List.of("Hasadi", "Siregar", "Akbar", "Putra")
        );

        System.out.println(queue);
        // output: [Akbar, Hasadi, Putra, Siregar]

        // menghapus elemen pertama dan return nilainya
        System.out.println(queue.poll());
        // output: Akbar

        System.out.println(queue.size());
        // output: 3
    }
}
