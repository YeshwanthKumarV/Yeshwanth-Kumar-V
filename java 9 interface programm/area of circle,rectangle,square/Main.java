package com.Java_9;

public class Main implements Area {
    public static void main(String[] args) {
      
        double circleRadius = 9.0;
        double rectangleLength = 3.0;
        double rectangleWidth = 2.0;
        double triangleBase = 3.0;
        double triangleHeight = 5.0;

        // Using default method for circle area
        double circleArea = new Main().calculateCircleArea(circleRadius);
        System.out.println("Circle Area: " + circleArea);

        // Using public method to display rectangle area
        new Main().displayRectangleArea(rectangleLength, rectangleWidth);

        // Using static method to display triangle area
        Area.displayTriangleArea(triangleBase, triangleHeight);
    }
}
