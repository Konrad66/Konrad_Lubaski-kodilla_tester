package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WeatherServiceTestSuite {


    @Test
    public void testGetMessage(){
        WeatherService weatherService = new WeatherService();
        Person konrad = Mockito.mock(Person.class);
        Location katowice = Mockito.mock(Location.class);
        Person wiktoria = Mockito.mock(Person.class);
        Message message = Mockito.mock(Message.class);

        weatherService.addPersonToLocation(konrad, katowice);
        weatherService.addPersonToLocation(wiktoria, katowice);
        weatherService.sendMessage(message);
        Mockito.verify(konrad).receive(message);
        Mockito.verify(wiktoria).receive(message);
    }


    @Test
    public void testForRemovePersonFromLocation(){
        WeatherService weatherService = new WeatherService();
        Person konrad = Mockito.mock(Person.class);
        Location katowice = Mockito.mock(Location.class);
        Person wiktoria = Mockito.mock(Person.class);
        Message message = Mockito.mock(Message.class);

        weatherService.addPersonToLocation(konrad, katowice);
        weatherService.addPersonToLocation(wiktoria, katowice);
        weatherService.removePersonFromLocation(wiktoria, katowice);
        weatherService.sendMessage(message);
        Mockito.verify(konrad).receive(message);
        Mockito.verify(wiktoria, Mockito.never()).receive(message);
    }




}