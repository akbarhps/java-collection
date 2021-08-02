package com.charuniverse.javacollection.b_collection_interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();

        // Menambah data

        names.add("Akbar");
        names.addAll(List.of("Hasadi", "Putra", "Siregar", "Ganteng", "Banget"));

        System.out.println(names);
        // Output: [Akbar, Hasadi, Putra, Siregar, Ganteng, Banget]

        System.out.println();

        // Menghapus data

        names.remove("Hasadi");
        names.removeAll(List.of("Putra", "Siregar"));

        System.out.println(names);
        // Output: [Akbar, Ganteng, Banget]

        System.out.println();

        // Mengecek data

        System.out.println(names.contains("Kejelekan"));
        // Output: false

        System.out.println(
                names.containsAll(List.of("Akbar", "Ganteng", "Banget"))
        );
        // Output: true

        // Ukuran data
        System.out.println(names.size());
    }
}