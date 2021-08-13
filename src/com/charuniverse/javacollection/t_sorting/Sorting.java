package com.charuniverse.javacollection.t_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(
                List.of(5, 2, 3, 5, 457, 45, 6, 234, 24, 2, 5, 245, 34)
        );
        System.out.println(list); // [5, 2, 3, 5, 457, 45, 6, 234, 24, 2, 5, 245, 34]
//        Collections.sort(list);
//        System.out.println(list); // [2, 2, 3, 5, 5, 5, 6, 24, 34, 45, 234, 245, 457]

        Comparator<Integer> comparator = Comparator.reverseOrder();
        list.sort(comparator); // same as Collections.sort();
        System.out.println(list); // [457, 245, 234, 45, 34, 24, 6, 5, 5, 5, 3, 2, 2]
    }
}