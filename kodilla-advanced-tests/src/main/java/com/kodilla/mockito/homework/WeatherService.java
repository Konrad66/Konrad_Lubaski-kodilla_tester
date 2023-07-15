package com.kodilla.mockito.homework;

import com.kodilla.mockito.Client;

import java.util.*;

public class WeatherService {

    private Map<Person, Set<Location>> locationsMap = new HashMap<>();

    public void addPersonToLocation(Person person, Location location) {
        Set<Location> locations = new HashSet<>();
        if (locationsMap.containsKey(person)) {
            locations = locationsMap.get(person);
        }
        locations.add(location);
        locationsMap.put(person, locations);
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
}