package com.Java_9;

public class MMain implements Square {
    public static void main(String[] args) {
        double number = 5.0;
        // Using default method to find square
        double square = new MMain().findSquare(number);
        System.out.println("Square: " + square);

        // Using public method to display cube
        new MMain().displayCube(number);

        // Using static method to display square root
        Square.displaySquareRoot(number);
    }
}
