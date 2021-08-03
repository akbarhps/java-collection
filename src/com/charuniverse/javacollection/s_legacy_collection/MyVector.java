package com.charuniverse.javacollection.s_legacy_collection;

import java.util.List;
import java.util.Vector;

public class MyVector {
    public static void main(String[] args) {
        List<String> list = new Vector<>(
                List.of("Akbar", "Hasadi", "Putra", "Siregar")
        );
        System.out.println(list);
        // output: [Akbar, Hasadi, Putra, Siregar]
    }
}
