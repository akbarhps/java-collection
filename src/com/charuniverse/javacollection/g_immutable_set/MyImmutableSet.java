package com.charuniverse.javacollection.g_immutable_set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MyImmutableSet {
    public static void main(String[] args) {
        Set<Integer> empty = Collections.emptySet();
        Set<Integer> single = Collections.singleton(1);
        Set<Integer> set = Set.of(1, 2, 3);
        Set<Integer> modifiableSet = new HashSet<>(set);
        Set<Integer> unmodifiableSet = Collections.unmodifiableSet(modifiableSet);
    }
}
