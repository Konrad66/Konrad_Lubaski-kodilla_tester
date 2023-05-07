package com.kodilla;

import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {

        Random value = new Random();
        int max = 31;
        int min = 0;

        int sum = 0;
        int liczba = 0;

        while (sum <= 5000) {
            for(int i = 0; i <= liczba; i++){
            liczba = value.nextInt(31);
            sum = sum + liczba;
            System.out.println(liczba);
        }
        System.out.println(sum);

        }
            if (max < liczba) {
                max = liczba;
            }
            if (min > liczba) {
                min = liczba;
            }

        System.out.println("The biggest value is: " + max);
        System.out.println("The smallest value is: " + min);
    }
}