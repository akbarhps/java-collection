package com.charuniverse.javacollection.f_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MyHashSet {
    public static void main(String[] args) {
        Set<Integer> hashSet = new java.util.HashSet<>(
                List.of(5, 1, 3, 9, 6, 8, 5)
        );
        System.out.println(hashSet);
    }
}