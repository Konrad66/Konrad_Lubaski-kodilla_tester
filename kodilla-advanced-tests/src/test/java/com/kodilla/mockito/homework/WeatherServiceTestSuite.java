package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WeatherServiceTestSuite {

    private WeatherService weatherService = new WeatherService();
    private Person konrad = Mockito.mock(Person.class);
    private Person wiktoria = Mockito.mock(Person.class);
    private Person przemek = Mockito.mock(Person.class);

    private Location katowice = Mockito.mock(Location.class);
    private Location wroclaw = Mockito.mock(Location.class);
    private Message message = Mockito.mock(Message.class);
    private Location warsaw = Mockito.mock(Location.class);

    @Test
    public void addPersonToLocation() {
        weatherService.addLocationToPerson(katowice, konrad);
        Mockito.verify(konrad, Mockito.times(1));
    }
/*
    @Test
    public void testSendMessageToAllLocations() {
        weatherService.addLocationToPerson(katowice, konrad);
        weatherService.addLocationToPerson(wroclaw, wiktoria);
        weatherService.sendMessage(message);
        Mockito.verify(konrad).receive(message);
        Mockito.verify(wiktoria).receive(message);
    }

 */

    @Test
    public void testSendMessageToOneLocation() {
        weatherService.addLocationToPerson(katowice, konrad);
        weatherService.addLocationToPerson(wroclaw, wiktoria);
        weatherService.sendMessageToLocation(message, katowice);
        Mockito.verify(konrad).receive(message);
        Mockito.verify(wiktoria, Mockito.never()).receive(message);
    }

    @Test
    public void testForRemovePersonFromLocation() {
        weatherService.addLocationToPerson(katowice, konrad);
        weatherService.addLocationToPerson(wroclaw, wiktoria);
        weatherService.removePersonFromLocation(wiktoria, katowice);
        weatherService.sendMessageToLocation(message, katowice);
        Mockito.verify(konrad).receive(message);
        Mockito.verify(wiktoria, Mockito.never()).receive(message);
    }
/*
    @Test
    public void testRemovePersonFromAllLocation() {
        weatherService.addLocationToPerson(warsaw, konrad);
        weatherService.addLocationToPerson(warsaw, przemek);
        weatherService.addLocationToPerson(katowice, konrad);
        weatherService.removePersonFromAllLocation(przemek);
        weatherService.sendMessage(message);
        Mockito.verify(przemek, Mockito.never()).receive(message);
    }

 */

    @Test
    public void testRemoveLocation() {
        weatherService.addLocationToPerson(katowice, przemek);
        weatherService.addLocationToPerson(wroclaw, konrad);
        weatherService.addLocationToPerson(warsaw, wiktoria);
        weatherService.removeLocation(warsaw);
        weatherService.sendMessage(message);

        Mockito.verify(przemek).receive(message);
        Mockito.verify(konrad).receive(message);
        Mockito.verify(wiktoria, Mockito.never()).receive(message);
    }
}