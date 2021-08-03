package com.charuniverse.javacollection.p_navigable_map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class MyNavigableMap {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>(
                Map.of(
                        "1", "Akbar",
                        "3", "Putra",
                        "4", "Siregar",
                        "2", "Hasadi"
                )
        );
        System.out.println(map);
        // output: {1=Akbar, 2=Hasadi, 3=Putra, 4=Siregar}

        System.out.println(map.lowerEntry("1"));
        // output: null

        System.out.println(map.higherEntry("2"));
        // output: 3=Putra
    }
}