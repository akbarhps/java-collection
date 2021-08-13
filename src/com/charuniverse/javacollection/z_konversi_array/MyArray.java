package com.charuniverse.javacollection.z_konversi_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(
                List.of(1, 2, 3, 3, 4, 5, 67, 7, 7, 8, 7, 6, 5)
        );
        Object[] objects = list.toArray();
        Integer[] integers = list.toArray(new Integer[]{});
        System.out.println(Arrays.toString(objects)); // [1, 2, 3, 3, 4, 5, 67, 7, 7, 8, 7, 6, 5]
        System.out.println(Arrays.toString(integers)); // [1, 2, 3, 3, 4, 5, 67, 7, 7, 8, 7, 6, 5]
    }
}