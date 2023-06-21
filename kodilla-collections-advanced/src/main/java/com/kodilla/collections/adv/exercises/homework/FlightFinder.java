package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlightFinder {

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> flights = FlightRepository.getFlightsTable();
        List<Flight> findFlights = new ArrayList<>();
        for (Flight flight : flights)
            if (departure.equals(flight.getDeparture()))
                findFlights.add(flight);
        return findFlights;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> flights = FlightRepository.getFlightsTable();
        List<Flight> findFlights = new ArrayList<>();
        for (Flight flight : flights)
            if (arrival.equals(flight.getArrival()));
        return findFlights;
    }
}