package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String directorName;

    public Principal(String directorName) {
        this.directorName = directorName;
    }

    public String getDirectorName() {
        return directorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Principal principal)) return false;
        return Objects.equals(directorName, principal.directorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(directorName);
    }

    @Override
    public String toString() {
        return "Principal{" +
                "directorName='" + directorName + '\'' +
                '}';
    }
}

