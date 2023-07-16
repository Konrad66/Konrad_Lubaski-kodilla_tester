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
        weatherService.addPersonToLocation(konrad, katowice);
        Mockito.verify(konrad, Mockito.times(1));
    }

    @Test
    public void testSendMessageToOneLocation() {
        weatherService.addPersonToLocation(konrad, katowice);
        weatherService.addPersonToLocation(wiktoria, wroclaw);
        weatherService.sendMessageToOneLocation(message, katowice);
        Mockito.verify(konrad).receive(message);
        Mockito.verify(wiktoria, Mockito.never()).receive(message);
    }

    @Test
    public void testSendMessageToAllLocations() {
        weatherService.addPersonToLocation(konrad, katowice);
        weatherService.addPersonToLocation(wiktoria, wroclaw);
        weatherService.sendMessage(message);
        Mockito.verify(konrad).receive(message);
        Mockito.verify(wiktoria).receive(message);
    }

    @Test
    public void testForRemovePersonFromLocation() {
        weatherService.addPersonToLocation(konrad, katowice);
        weatherService.addPersonToLocation(wiktoria, katowice);
        weatherService.removePersonFromLocation(wiktoria, katowice);
        weatherService.sendMessageToOneLocation(message, katowice);
        Mockito.verify(konrad).receive(message);
        Mockito.verify(wiktoria, Mockito.never()).receive(message);

    }

    /*

    @Test
    public void testRemovePersonFromAllLocation() {
        weatherService.addPersonToLocation(konrad, katowice);
        weatherService.addPersonToLocation(przemek, katowice);
        weatherService.addPersonToLocation(konrad, wroclaw);
        weatherService.addPersonToLocation(przemek, wroclaw);
        weatherService.addPersonToLocation(przemek, warsaw);
        weatherService.removePersonFromAllLocation(przemek);
        weatherService.sendMessage(message);
        Mockito.verify(konrad).receive(message);
        Mockito.verify(przemek, Mockito.never()).receive(message);

}
     */


/*
    @Test
    public void testRemoveLocation() {
        weatherService.addPersonToLocation(przemek, katowice);
        weatherService.addPersonToLocation(konrad, wroclaw);
        weatherService.addPersonToLocation(wiktoria, warsaw);

        weatherService.removeLocation();

        //Mockito.verify(katowice);
        Mockito.verify(wroclaw);
        Mockito.verify(katowice);
        Mockito.verify(warsaw);

        //Assertions.assertEquals(0,weatherService);

    }

 */


}