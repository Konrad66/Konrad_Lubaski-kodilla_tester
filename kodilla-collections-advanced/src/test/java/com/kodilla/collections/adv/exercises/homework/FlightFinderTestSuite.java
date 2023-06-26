package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom(){
        //given
        FlightFinder flightFinder = new FlightFinder();
        String departure = "Katowice";
        //when
        List<Flight> result = flightFinder.findFlightsFrom(departure);
        //then
        assertEquals(2, result.size());
        for(Flight flight : result){
            assertEquals(departure, flight.getDeparture());
        }
    }

    @Test
    public void testFindFlightsTo(){
        //given
        FlightFinder flightFinder = new FlightFinder();
        String arrival = "London";
        //when
        List<Flight> result = flightFinder.findFlightsTo(arrival);
        //then
        assertEquals(2, result.size());
        for(Flight flight : result){
            assertEquals(arrival, flight.getArrival());
        }
    }
}