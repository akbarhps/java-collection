package com.charuniverse.javacollection.h_sorted_set;

import com.charuniverse.javacollection.e_immutable_list.Person;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
