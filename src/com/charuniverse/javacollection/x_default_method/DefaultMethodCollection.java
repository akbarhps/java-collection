package com.charuniverse.javacollection.x_default_method;

import java.util.ArrayList;
import java.util.List;

public class DefaultMethodCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(
                List.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
        );
        list.replaceAll(integer -> integer * 10);
        System.out.println(list); // [10, 20, 30, 40, 50, 60, 70, 80, 90]
    }
}