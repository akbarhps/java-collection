package com.charuniverse.javacollection.x_default_method;

import java.util.HashMap;
import java.util.Map;

public class DefaultMethodMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Akbar", 9191919);
        map.replaceAll((s, integer) -> integer / 1010);
        System.out.println(map.get("Akbar")); // 9100
    }
}