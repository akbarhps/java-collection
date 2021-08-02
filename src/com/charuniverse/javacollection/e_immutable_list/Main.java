package com.charuniverse.javacollection.e_immutable_list;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person akbar = new Person("Akbar");
        akbar.addHobby("Menggarai Orang");
        akbar.addHobby("Gabut");

        doSomethingWithHobbies(akbar.getHobbies());
        System.out.println(akbar);
    }

    public static void doSomethingWithHobbies(List<String> hobbies) {
        // hobbies.add("Mantul");
        // Error Exception: Exception in thread "main" java.lang.UnsupportedOperationException
    }
}