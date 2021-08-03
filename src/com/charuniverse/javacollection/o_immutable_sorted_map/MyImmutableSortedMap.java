package com.charuniverse.javacollection.o_immutable_sorted_map;

import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MyImmutableSortedMap {
    public static void main(String[] args) {
        SortedMap<String, String> empty = Collections.emptySortedMap();
        SortedMap<String, String> modifiableSortedMap = new TreeMap<>(
                Map.of(
                        "1", "Akbar",
                        "3", "Putra",
                        "4", "Siregar",
                        "2", "Hasadi"
                )
        );
        Map<String, String> unmodifiableSortedMap = Collections
                .unmodifiableSortedMap(modifiableSortedMap);
    }
}
