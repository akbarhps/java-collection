package com.charuniverse.javacollection.m_immutable_map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MyImmutableMap {
    public static void main(String[] args) {
        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> single = Collections.singletonMap("firstName", "Akbar");
        Map<String, String> map = Map.of(
                "firstName", "Akbar",
                "lastName", "Putra"
        );
        Map<String, String> modifiableList = new HashMap<>(map);
        Map<String, String> unmodifiableList = Collections.unmodifiableMap(modifiableList);
    }
}