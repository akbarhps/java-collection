package com.charuniverse.javacollection.l_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyLinkedHashMap {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("firstName", "Akbar");
        map.put("lastName", "Putra");
        System.out.println(map);
        // output: {firstName=Akbar, lastName=Putra}
    }
}