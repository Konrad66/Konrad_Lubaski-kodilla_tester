package com.kodilla.spring.basic.spring_configuration.homework;

public class Cabrio implements Car{

    private boolean hasHeadlightsTurnedOn;

    public Cabrio(boolean hasHeadlightsTurnedOn) {
        this.hasHeadlightsTurnedOn = hasHeadlightsTurnedOn;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return hasHeadlightsTurnedOn;
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}
