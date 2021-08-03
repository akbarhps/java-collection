package com.charuniverse.javacollection.r_entry;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyEntryInterface {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(
                Map.of(
                        "1", "Akbar",
                        "3", "Putra",
                        "2", "Hasadi",
                        "4", "Siregar"
                )
        );
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (var entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}