package com.charuniverse.javacollection.i_navigable_set;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class MyNavigableSet {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>(
                Set.of("Akbar", "Hasadi", "Putra", "Siregar")
        );
        System.out.println(names);
        // output: [Akbar, Hasadi, Putra, Siregar]

        System.out.println(names.descendingSet());
        // output: [Siregar, Putra, Hasadi, Akbar]

        System.out.println(names.higher("Akbar"));
        // output: Hasadi

        names.pollFirst();
        System.out.println(names);
        // output: [Hasadi, Putra, Siregar]

        System.out.println(names.headSet("Putra", true));
        // output: [Hasadi, Putra]

        System.out.println(names.tailSet("Putra", false));
        // output: [Siregar]
    }
}