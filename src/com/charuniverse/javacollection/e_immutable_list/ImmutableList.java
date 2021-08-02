package com.charuniverse.javacollection.e_immutable_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableList {
    public static void main(String[] args) {
        List<Integer> empty = Collections.emptyList();
        List<Integer> single = Collections.singletonList(1);
        List<Integer> list = List.of(1, 2, 3);
        List<Integer> modifiableList = new ArrayList<>(list);
        List<Integer> unmodifiableList = Collections.unmodifiableList(modifiableList);
    }
}
