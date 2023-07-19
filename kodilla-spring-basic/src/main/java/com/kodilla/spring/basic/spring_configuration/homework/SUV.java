package com.kodilla.spring.basic.spring_configuration.homework;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;

public class SUV implements Car {

    private boolean hasHeadlightsTurnedOn;

    public SUV(boolean hasHeadlightsTurnedOn) {
        this.hasHeadlightsTurnedOn = hasHeadlightsTurnedOn;

    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return hasHeadlightsTurnedOn;
    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}