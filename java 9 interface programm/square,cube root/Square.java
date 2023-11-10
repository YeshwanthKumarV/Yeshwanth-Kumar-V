package com.Java_9;

public interface Square 
{
    // Default method for finding square
    public default double findSquare(double number) {
        return number * number;
    }

    // Private method for finding cube
    private double findCube(double number) {
        return number * number * number;
    }

    // Private static method for finding square root
    private static double findSquareRoot(double number) {
        return Math.sqrt(number);
    }

   
    public default void displayCube(double number) {
        double cube = findCube(number);
        System.out.println("Cube: " + cube);
    }

    // Public static method to display square root
    public static void displaySquareRoot(double number) {
        double squareRoot = findSquareRoot(number);
        System.out.println("Square Root: " + squareRoot);
    }
}

