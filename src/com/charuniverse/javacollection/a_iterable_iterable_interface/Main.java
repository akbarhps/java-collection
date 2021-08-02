package com.charuniverse.javacollection.a_iterable_iterable_interface;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Iterable<String> names = List.of("Akbar", "Hasadi", "Putra", "Siregar");

        for (String name: names) {
            System.out.print(name + " ");
        }
        // Output: Akbar Hasadi Putra Siregar

        Iterator<String> nameIterator = names.iterator();

        while (nameIterator.hasNext()) {
            System.out.print(nameIterator.next() + " ");
        }
        // Output: Akbar Hasadi Putra Siregar
    }
}
