package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Opel implements Car{

    private int speed;

    public Opel(int speed){
        this.speed = speed;
    }
    @Override
    public int getSpeed() {
        return speed;
    }
    @Override
    public void increaseSpeed() {
        this.speed += 5;
    }
    @Override
    public void decreaseSpeed() {
        this.speed -= 2;
    }

    @Override
    public String toString() {
        return "Opel{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Opel opel)) return false;
        return speed == opel.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
