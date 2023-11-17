// Package com.cognizant.shapes
package com.cognizant.shapes;

// Class Circle
public class Circle {
    // Problem Statement 4a: Restrict access to the variable radius
    private float radius;

    // Problem Statement 4b: Package level access to Constructor 2 and variable pi
    float pi;

    // Problem Statement 1: Default constructor
    public Circle() {
        // Initialize radius to default value 1.5f
        this.radius = 1.5f;
    }

    // Problem Statement 2: Overloaded constructor 2
    public Circle(float radius) {
        // Initialize radius with the method argument radius
        this.radius = radius;
    }

    // Problem Statement 2: Overloaded constructor 3
    Circle(float radius, float pi) {
        // Default pi value to 3.5 and set the instance variable with the radius method argument
        this.pi = 3.5f;
        this.radius = radius;
    }

    // Problem Statement 3: Constructor chaining
    public Circle(float radius, float pi, boolean chain) {
        // Invoke Constructor 3 from Constructor 2
        this(radius, pi);
    }

    // Problem Statement 5a: Method to calculate area
    float calculateCircleArea(float radius) {
        return pi * radius * radius;
    }

    // Problem Statement 5b: Method to calculate circumference
    float calculateCircumference(float radius) {
        return 2 * pi * radius;
    }

    // Main method
    public static void main(String[] args) {
        // Problem Statement 1: Invoke default constructor from main method
        Circle circle1 = new Circle();

        // Problem Statement 2: Invoke overloaded constructor 2 from main method
        Circle circle2 = new Circle(2.0f);

        // Problem Statement 3: Invoke constructor chaining
        Circle circle3 = new Circle(3.0f, 3.14f, true);

        // Problem Statement 5: Call methods to calculate area and circumference
        float area_of_circle_1 = circle1.calculateCircleArea(1.5f);
        float area_of_circle_2 = circle2.calculateCircleArea(1.5f);
        float area_of_circle_3 = circle3.calculateCircleArea(1.5f);
        float circumference_of_circle_1 = circle1.calculateCircumference(2.0f);
        float circumference_of_circle_2 = circle2.calculateCircumference(2.0f);
        float circumference_of_circle_3 = circle3.calculateCircumference(2.0f);

        // Print results
        System.out.println("Area1: " + area_of_circle_1);
        System.out.println("Area2: " + area_of_circle_2);
        System.out.println("Area3: " + area_of_circle_3);
        System.out.println("Circumference1: " +circumference_of_circle_1);
        System.out.println("Circumference2: " + circumference_of_circle_2);
        System.out.println("Circumference3: " + circumference_of_circle_3);
    }
}