package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {

    public static void main(String[] args) {
        Map<Principal, School> schoolInfo = new HashMap<>();
        Principal dominic = new Principal("Dominic Smith");
        Principal konrad = new Principal("Konrad Nowak");
        Principal wiktoria = new Principal("Wiktoria Kowalska");


        School dominicSchool = new School("Śląskie Techniczne Zakłady Naukowe", 5, Arrays.asList(21, 26, 19, 24, 26));
        School konaradSchool = new School("1 Liceum Ogólnokształcące", 7, Arrays.asList(15, 18, 28, 24, 26, 25, 32));
        School wiktoriaSchool = new School("Technikum nr 17 w Katowichac", 3, Arrays.asList(28, 32, 27));

        schoolInfo.put(dominic, dominicSchool);
        schoolInfo.put(konrad, konaradSchool);
        schoolInfo.put(wiktoria, wiktoriaSchool);

        for (Map.Entry<Principal, School> schoolEntry : schoolInfo.entrySet()) {
            System.out.println(schoolEntry.getKey().getDirectorName() + " is the principal of the school: " + schoolEntry.getValue().toString());
        }


    }
}
