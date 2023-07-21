package com.kodilla.mockito.homework;

import com.kodilla.mockito.Client;

import java.util.*;

public class WeatherService {

    /*
    private  Map<Location, Set<Person>> locationsMap = new HashMap<>();
    //private Map<Person, Set<Location>> locationsMap = new HashMap<>();

    public void addPersonToLocation(Person person, Location location) {
        Set<Person> personSet = new HashSet<>();
        if (locationsMap.containsKey(location)) {
            personSet = locationsMap.get(location);
        }
        personSet.add(person);
        locationsMap.put(location, personSet);
    }


    public void addPersonToLocation(Person person, Location location) {
        Set<Person> personSet = new HashSet<>();
        if (locationsMap.containsKey(location)) {
            personSet = locationsMap.get(location);
        }
        personSet.add(person);
        locationsMap.put(location, personSet);
    }



    public void sendMessage(Message message) {
        this.locationsMap.forEach((person, locations) -> person.receive(message));
    }

    public void sendMessageToOneLocation(Message message, Location location) {
        locationsMap.forEach((person, locations) -> {
            if (locations.contains(location)) {
                person.receive(message);
            }
        });
    }

    public void removePersonFromLocation(Person person, Location location) {
        if (locationsMap.containsKey(person)) {
            locationsMap.get(person).remove(location);
        }
    }

    public void removePersonFromAllLocation(Person person) {
       Set<Location> locations = new HashSet<>();
      //  if (locationsMap.containsKey(person)) {
       //     this.locationsMap.get(person).remove(locations);
       // }

        this.locationsMap.get(person).remove(locations);
    }


    public void removeLocation() {
        locationsMap.clear();
    }
    */

}