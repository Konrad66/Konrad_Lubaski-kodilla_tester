package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Ford implements Car {

    private int speed;

    public Ford(int speed){
        this.speed = speed;
    }

    @Override

    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed += 3;
    }

    @Override
    public void decreaseSpeed() {
        this.speed -= 1;
    }

    @Override
    public String toString() {
        return "Ford{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ford ford)) return false;
        return speed == ford.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
