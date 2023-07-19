package com.kodilla.spring.basic.spring_configuration.homework;

public class Sedan implements Car{

    private boolean hasHeadlightsTurnedOn;

    public Sedan(boolean hasHeadlightsTurnedOn) {
        this.hasHeadlightsTurnedOn = hasHeadlightsTurnedOn;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return hasHeadlightsTurnedOn;
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}
