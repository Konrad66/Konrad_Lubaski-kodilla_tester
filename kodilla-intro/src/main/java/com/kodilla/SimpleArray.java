package com.kodilla;

public class SimpleArray {
    public static void main(String[] args){
        String[] newArray = new String[5];
        newArray[0] = "Konrad";
        newArray[1] = "Maze ranner";
        newArray[2] = "Poduszka";
        newArray[3] = "Ksiazka";
        newArray[4] = "Zegarek";

        String arrayValue = newArray[3];
        System.out.println(arrayValue);

        int numberOfElements = newArray.length;
        System.out.println("My Array has " + numberOfElements + " elements");



    }
}
