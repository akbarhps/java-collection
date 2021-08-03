package com.charuniverse.javacollection.f_set;

import java.util.HashSet;
import java.util.Set;

public class MyHashSet {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>(
                Set.of(5, 1, 3, 9, 6, 8)
        );
        System.out.println(hashSet);
    }
}