package com.charuniverse.javacollection.l_map;

import java.util.Map;
import java.util.WeakHashMap;

public class MyWeakHashMap {
    public static void main(String[] args) {
        Map<Integer, Integer> weakHashmap = new WeakHashMap<>();
        for (int i = 1; i <= 1_000_000; i++) {
            weakHashmap.put(i, i);
        }
        System.gc(); // run java garbage collector
        System.out.println(weakHashmap.size());
        // output: 790330
        // output berubah sesuai dengan garbage collector
    }
}