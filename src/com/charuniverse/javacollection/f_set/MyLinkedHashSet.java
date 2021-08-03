package com.charuniverse.javacollection.f_set;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MyLinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> linkedHashSet = new LinkedHashSet<>(
                List.of(5, 1, 3, 9, 6, 8, 5)
        );
        System.out.println(linkedHashSet);
    }
}
