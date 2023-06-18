package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String nameStamp;
    private double length;
    private double width;
    private boolean stampedOrNot;

    public Stamp(String nameStamp, double length, double width, boolean stampedOrNot) {
        this.nameStamp = nameStamp;
        this.length = length;
        this.width = width;
        this.stampedOrNot = stampedOrNot;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public String getNameStamp() {
        return nameStamp;
    }


    public boolean isStampedOrNot() {
        return stampedOrNot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stamp stamp)) return false;
        return Double.compare(stamp.length, length) == 0 && Double.compare(stamp.width, width) == 0 && stampedOrNot == stamp.stampedOrNot && Objects.equals(nameStamp, stamp.nameStamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameStamp, length, width, stampedOrNot);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "nameStamp='" + nameStamp + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", stampedOrNot=" + stampedOrNot +
                '}';
    }
}
