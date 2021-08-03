package com.charuniverse.javacollection.f_set;

import java.util.EnumSet;
import java.util.Set;

public class MyEnumSet {
    public enum Gender {
        MALE,
        FEMALE,
        NOT_MENTIONED
    }

    public static void main(String[] args) {
        Set<Gender> genders = EnumSet.of(Gender.MALE, Gender.FEMALE);
        genders.add(Gender.NOT_MENTIONED);
        System.out.println(genders);
    }
}