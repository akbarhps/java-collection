package com.charuniverse.javacollection.s_legacy_collection;

import java.util.Hashtable;
import java.util.Map;

public class MyHashtable {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<>(
                Map.of(
                        "1", "Akbar",
                        "2", "Hasadi",
                        "3", "Putra",
                        "4", "Siregar"
                )
        );
        System.out.println(map);
        // output: {4=Siregar, 3=Putra, 2=Hasadi, 1=Akbar}
    }
}