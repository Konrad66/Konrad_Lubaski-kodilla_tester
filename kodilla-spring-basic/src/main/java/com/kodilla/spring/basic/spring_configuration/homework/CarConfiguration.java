package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Configuration
public class CarConfiguration {

    @Bean
    @Scope("prototype")
    public Car getCar(String season, LocalTime hour) {
        boolean lightsOn = hour.isAfter(LocalTime.of(20, 0, 0)) || hour.isBefore(LocalTime.of(6, 0, 1));
        if(season.equals("Summer")){
            return new Cabrio(lightsOn);
        } else if (season.equals("Spring") || season.equals("Autumn")) {
            return new Sedan(lightsOn);
        } else {
            return new SUV(lightsOn);
        }
    }
    @Bean
    public SUV createSUV() {
        return new SUV(true);
    }

    @Bean
    public Cabrio createCabrio() {
        return new Cabrio(true);
    }

    @Bean
    public Sedan createSedan() {
        return new Sedan(true);
    }

}