package com.charuniverse.javacollection.y_spliterator;

import java.util.List;
import java.util.Spliterator;

public class MySpliterator {
    public static void main(String[] args) {
        List<String> list = List.of("Akbar", "Hasadi", "Putra", "Siregar", "Ganteng", "Bet", "Seriusan", "Ga", "Boong");
        Spliterator<String> spliterator1 = list.spliterator();
        Spliterator<String> spliterator2 = spliterator1.trySplit();

        System.out.println(spliterator1.estimateSize()); // 5
        spliterator1.forEachRemaining(s -> System.out.print(s + " ")); // Ganteng Bet Seriusan Ga Boong
        System.out.println(spliterator2.estimateSize()); // 4
        spliterator2.forEachRemaining(s -> System.out.print(s + " ")); // Akbar Hasadi Putra Siregar
    }
}