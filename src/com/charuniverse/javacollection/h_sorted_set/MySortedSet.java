package com.charuniverse.javacollection.h_sorted_set;

import com.charuniverse.javacollection.e_immutable_list.Person;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class MySortedSet {
    public static void main(String[] args) {
        /**
         * Exception: Exception in thread "main" java.lang.ClassCastException:
         * class com.charuniverse.javacollection.e_immutable_list.Person cannot be cast to class
         * java.lang.Comparable (com.charuniverse.javacollection.e_immutable_list.Person is in
         * unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
         *
         * terjadi jika parameter type tidak meng-implement Comparable,
         * atau object SortedSet tidak memiliki Comparator
         */
        SortedSet<Person> people = new TreeSet<>(
//                Comparator.comparing(Person::getName)
                new PersonComparator()
        );
        people.addAll(
                Set.of(
                        new Person("Akbar"),
                        new Person("Hasadi"),
                        new Person("Putra"),
                        new Person("Siregar")
                )
        );
        System.out.println(people);
    }
}
