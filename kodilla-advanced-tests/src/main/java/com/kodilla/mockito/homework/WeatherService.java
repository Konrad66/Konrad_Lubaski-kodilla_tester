package com.kodilla.mockito.homework;

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

    public void removePersonFromAllLocation(Person person, Location location) {
        this.locationsMap.get(location).remove(person);
    }

    public void removeLocation(Location location) {
        if (locationsMap.containsValue(location)){
            locationsMap.remove(location);
        }
    }


}
