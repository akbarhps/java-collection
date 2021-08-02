package com.charuniverse.javacollection.c_array_list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // inisialisasi dan menbambah data
        List<String> names = new ArrayList<>(
                List.of("Akbar", "Hasadi", "Putra", "Siregar")
        );

        // mengakses data pada index 0
        System.out.println(names.get(0));
        // output: Akbar

        // mengedit data pada index 1
        names.set(1, "Ganteng");
        System.out.println(names);
        // output: [Akbar, Ganteng, Putra, Siregar]

        // menghapus data
        names.removeAll(List.of("Putra", "Siregar"));
        System.out.println(names);
        // output: [Akbar, Ganteng]
    }
}