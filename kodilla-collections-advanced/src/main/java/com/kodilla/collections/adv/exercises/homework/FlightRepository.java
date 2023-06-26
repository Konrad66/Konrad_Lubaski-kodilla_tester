package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable(){
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Katowice", "London"));
        flights.add(new Flight("Katowice", "Dublin"));
        flights.add(new Flight("Dublin", "London"));
        flights.add(new Flight("Milan", "Warsaw"));
        return flights;
    }
}