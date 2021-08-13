package com.charuniverse.javacollection.v_collections_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyCollectionsClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4));
        System.out.println(list); // [1, 2, 3, 4]
        Collections.shuffle(list);
        System.out.println(list); // [2, 1, 3, 4]
        Collections.reverse(list);
        System.out.println(list); // [4, 3, 1, 2]
    }
}