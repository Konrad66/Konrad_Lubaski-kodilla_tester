package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Szopki Karowskie", 4, 3.5, true));
        stamps.add(new Stamp("Wielkanoc", 4.2, 3.7, false));
        stamps.add(new Stamp("Europa", 3.8, 3.2, true));
        stamps.add(new Stamp("Piękno Polski", 4.1, 3.4, false));
        stamps.add(new Stamp("Szopki Karowskie", 4, 3.5, true)); //powtórzony
        stamps.add(new Stamp("Europa", 3.8, 3.2, true)); //powtórzony

        System.out.println(stamps.size());
        for(Stamp stamp : stamps){
            System.out.println(stamp);
        }


    }
}
