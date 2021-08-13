package com.charuniverse.javacollection.w_abstract_class;

public class MyAbstractClass {
    public static void main(String[] args) {
        SingleQueue<String> kuy = new SingleQueue<>();
        System.out.println(kuy.offer("Akbar")); // true
        System.out.println(kuy.offer("Hasadi")); // false
        System.out.println(kuy.offer("Putra")); // false
        System.out.println(kuy.offer("Siregar")); // false
        System.out.println(kuy.peek()); // Akbar
        System.out.println(kuy.size()); // 1
        System.out.println(kuy.poll()); // Akbar
        System.out.println(kuy.size()); // 0
    }
}