package com.kodilla;

import java.util.Scanner;

public class Color {

    public static void main(String[] args){
        Color color = new Color();
        String result = Color.getUserSelectColor();
        System.out.println("You choose: " + result);
    }


    public static String getUserSelectColor(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String a = Color.getColor();
            switch (a) {
                case "R": return "Red";
                case "G": return "Green";
                case "B": return "Blue";
                case "Y": return "yellow";
                case "O": return "Orange";
                default: System.out.println("You choose wrong letter. Try again.");
            }
        }
    }

    public static String getColor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select your color: R-Red, G-Green, B-Blue, Y-Yellow, O-Orange");
        String letter = scanner.nextLine().trim();
        return letter;
    }
}