package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Audi implements Car{
    private int speed;

    public Audi(int speed){
        this.speed = speed;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed += 10;
    }

    @Override
    public void decreaseSpeed() {
        this.speed -= 6;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Audi audi)) return false;
        return speed == audi.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
