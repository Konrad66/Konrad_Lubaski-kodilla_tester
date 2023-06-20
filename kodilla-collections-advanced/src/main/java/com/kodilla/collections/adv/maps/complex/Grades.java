package com.kodilla.collections.adv.maps.complex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Grades {
    private List<Double> grades = new ArrayList<>();

    public Grades(List<Double> grades){
        this.grades = grades;
    }

    public double getAvarage(){
        double sum = 0.0;
        for (double grade : grades){
            sum += grade;
        }
        return sum / grades.size();
    }

    @Override
    public String toString() {
        return "Grades: " + grades.toString();
    }

    public List<Double> getGrades() {
        return grades;
    }
}
