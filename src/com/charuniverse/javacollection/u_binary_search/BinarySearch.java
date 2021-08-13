package com.charuniverse.javacollection.u_binary_search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(
                List.of("Akbar", "Bakbar", "Cakbar", "Dakbar", "Eakbar", "Fakbar")
        );
        System.out.println(Collections.binarySearch(list, "Eakbar")); // 4
        list.sort(Comparator.reverseOrder());
        System.out.println(list); // [Fakbar, Eakbar, Dakbar, Cakbar, Bakbar, Akbar]
        System.out.println(
                Collections.binarySearch(list, "Cakbar", Comparator.reverseOrder()) // 3
        );
    }
}