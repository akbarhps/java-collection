package com.charuniverse.javacollection.l_map;

import java.util.EnumMap;

public class MyEnumMap {
    public enum Membership {
        FREE, STANDARD, PREMIUM, VIP
    }

    public static void main(String[] args) {
        EnumMap<Membership, String> membershipType = new EnumMap<>(Membership.class);
        membershipType.put(Membership.FREE, "Gratis");
        membershipType.put(Membership.STANDARD, "Gratis + Donasi Saweria");
        membershipType.put(Membership.PREMIUM, "Berbayar");
        membershipType.put(Membership.VIP, "Berbayar + Donasi Saweria");
        System.out.println(membershipType);
        // output: {FREE=Gratis, STANDARD=Gratis + Donasi Saweria, PREMIUM=Berbayar, VIP=Berbayar + Donasi Saweria}
    }
}