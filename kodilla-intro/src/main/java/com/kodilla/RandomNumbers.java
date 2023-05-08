package com.kodilla;

import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {

        Random value = new Random();
        int max = 0;
        int min = 31;
        int sum = 0;
        int liczba = 0;

        while (sum <= 5000) {
            liczba = value.nextInt(31);
            sum = sum + liczba;
            System.out.println(liczba);
            if (max < liczba) {
                max = liczba;
            }
            if (min > liczba) {
                min = liczba;
            }
        }
        System.out.println(sum);
        System.out.println("The biggest value is: " + max);
        System.out.println("The smallest value is: " + min);
    }
}