package com.kodilla.spring.basic.spring_configuration.homework;

import java.sql.Time;
import java.util.Date;

public class SUV implements Car{

    @Override
    public boolean hasHeadlightsTurnedOn(){
        return true;
    }
    public String getCarType(){
        return "hej";
    }
}
