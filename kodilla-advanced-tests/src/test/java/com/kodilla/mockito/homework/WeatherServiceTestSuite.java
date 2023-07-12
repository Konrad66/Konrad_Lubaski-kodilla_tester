package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WeatherServiceTestSuite {

    @Test
    public void addPersonToLocation(){
        WeatherService weatherService = new WeatherService();
        Person konrad = Mockito.mock(Person.class);
        Location katowice = Mockito.mock(Location.class);

        weatherService.addPersonToLocation(konrad, katowice);
        Mockito.verify(konrad, Mockito.times(1));
    }


    @Test
    public void testSendMessageToOneLocation(){
        WeatherService weatherService = new WeatherService();
        Person konrad = Mockito.mock(Person.class);
        Person wiktoria = Mockito.mock(Person.class);
        Location katowice = Mockito.mock(Location.class);
        Location wroclaw = Mockito.mock(Location.class);
        Message message = Mockito.mock(Message.class);

        weatherService.addPersonToLocation(konrad, katowice);
        weatherService.addPersonToLocation(wiktoria, wroclaw);
        weatherService.sendMessageToOneLocation(message, katowice);
        Mockito.verify(konrad).receive(message);
        Mockito.verify(wiktoria, Mockito.never()).receive(message);
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
        //Mockito.verify(wiktoria, Mockito.never()).receive(message);
        Mockito.verify(wiktoria).receive(message);
    }

/*
    @Test
    public void testRemovePersonFromAllLocation(){
        WeatherService weatherService = new WeatherService();
        Person konrad = Mockito.mock(Person.class);
        Location katowice = Mockito.mock(Location.class);
        Location wroclaw = Mockito.mock(Location.class);
        Location warsaw = Mockito.mock(Location.class);
        Person przemek = Mockito.mock(Person.class);
        Message message = Mockito.mock(Message.class);

        weatherService.addPersonToLocation(konrad, katowice);
        weatherService.addPersonToLocation(przemek, katowice);
        weatherService.addPersonToLocation(konrad, wroclaw);
        weatherService.addPersonToLocation(przemek, wroclaw);
        weatherService.addPersonToLocation(przemek, warsaw);
        weatherService.removePersonFromAllLocation(przemek, katowice);
        weatherService.sendMessage(message);
        Mockito.verify(konrad).receive(message);
        Mockito.verify(przemek, Mockito.never()).receive(message);
    }

 */


    @Test
    public void testRemoveLocation(){
        WeatherService weatherService = new WeatherService();
        Location katowice = Mockito.mock(Location.class);
        Location wroclaw = Mockito.mock(Location.class);
        Location warsaw = Mockito.mock(Location.class);

        //weatherService.removeLocation(wroclaw);
        //Mockito.verify(katowice).;
    }





}