package com.charuniverse.javacollection.l_map;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("firstName", "Akbar");
        map.put("lastName", "Putra");
        map.put("level", "99999999");
        System.out.println(map);
        // output: {firstName=Akbar, lastName=Putra, level=99999999}
    }
}