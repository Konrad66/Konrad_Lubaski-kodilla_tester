package com.kodilla.mockito.homework;

import com.kodilla.mockito.Client;

import java.util.*;

public class WeatherService {

    private Map<Location, Set<Person>> locationMap = new HashMap<>();

    public void addLocationToPerson(Location location, Person person) {
        Set<Person> personSet = new HashSet<>();
        if (locationMap.containsValue(person)) {
            personSet = locationMap.get(person);
        }
        personSet.add(person);
        locationMap.put(location, personSet);
    }

    public void sendMessage(Message message) {
        this.locationMap.forEach((location, personSet) -> personSet.forEach(person -> person.receive(message)));
    }

    public void sendMessageToLocation(Message message, Location location) {
        this.locationMap.forEach((location1, personSet) -> {
            if (location1 == location) {
                personSet.forEach(person -> person.receive(message));
            }
        });
    }

    public void removePersonFromLocation(Person person, Location location) {
        if (locationMap.containsValue(person)) {
            locationMap.get(location).remove(person);
        }
    }

    public void removePersonFromAllLocation(Person person) {
        for (Map.Entry<Location, Set<Person>> result : locationMap.entrySet()) {
            result.getValue().remove(person);
        }
    }

    public void removeLocation(Location location) {
        this.locationMap.remove(location);
    }
}