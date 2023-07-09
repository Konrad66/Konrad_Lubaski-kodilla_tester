package com.kodilla.mockito.homework;

import java.util.*;

public class WeatherService {

    private Map<Person, Set<Location>> locationsMap = new HashMap<>();

    public void addPersonToLocation(Person person, Location location){
        Set<Location> locations = new HashSet<>();
        locations.add(location);
        locationsMap.put(person, locations);
    }

    public void sendMessage(Message message){
        this.locationsMap.forEach((person, locations) -> person.receive(message));
    }

    public void removePersonFromLocation(Person person, Location location){
        Set<Location> locations = new HashSet<>();
        locations.remove(location);
        locationsMap.remove(person, locations);
    }

    public void removePersonFromAllLocation(Person person, Location location){

    }

    public void sendMessageToAllPersons(Message message){

    }





}
