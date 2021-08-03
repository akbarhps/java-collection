package com.charuniverse.javacollection.n_sorted_map;

import java.util.SortedMap;
import java.util.TreeMap;

public class MySortedMap {
    public static void main(String[] args) {
        SortedMap<String, String> map = new TreeMap<>();
        map.put("3", "Putra");
        map.put("2", "Hasadi");
        map.put("1", "Akbar");
        map.put("4", "Siregar");
        System.out.println(map);
        // output: {1=Akbar, 2=Hasadi, 3=Putra, 4=Siregar}
    }
}
