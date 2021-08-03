package com.charuniverse.javacollection.q_immutable_navigable_map;

import java.util.Collections;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class MyImmutableNavigableMap {
    public static void main(String[] args) {
        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> modifiableNavigableMap = new TreeMap<>(
                Map.of(
                        "1", "Akbar",
                        "3", "Putra",
                        "4", "Siregar",
                        "2", "Hasadi"
                )
        );
        NavigableMap<String, String> unmodifiableNavigableMap = Collections
                .unmodifiableNavigableMap(modifiableNavigableMap);
    }
}
