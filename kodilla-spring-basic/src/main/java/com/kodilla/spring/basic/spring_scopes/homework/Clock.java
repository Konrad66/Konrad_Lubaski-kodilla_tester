package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
@Component
@Scope("prototype")
public class Clock {

    public Clock() {
        LocalDateTime nowInUTCTime = LocalDateTime.now(ZoneOffset.UTC);
    }

}
