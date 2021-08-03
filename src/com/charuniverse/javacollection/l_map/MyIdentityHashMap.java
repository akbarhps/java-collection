package com.charuniverse.javacollection.l_map;

import java.util.IdentityHashMap;
import java.util.Map;

public class MyIdentityHashMap {
    public static void main(String[] args) {
        Map<String, String> map = new IdentityHashMap<>();
        String key = "firstName";
        String first = "first";
        String name = "Name";
        String key2 = first + name;
        String value = "Akbar";

        map.put(key, value);
        map.put(key, value);
        map.put(key2, value);
        System.out.println(map);
        // output: {firstName=Akbar, firstName=Akbar}

        System.out.println(key.equals(key2));
        // output: true -> isi kedua String sama
        System.out.println(key == key2);
        // output: false -> lokasi memory kedua String berbeda
    }
}
