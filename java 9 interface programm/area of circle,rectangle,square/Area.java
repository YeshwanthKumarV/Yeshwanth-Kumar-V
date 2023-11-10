package com.Java_9;


	public interface Area {
	    // Default method for circle area
	    public default double calculateCircleArea(double radius) 
	    {
	        return Math.PI * radius * radius;
	    }

	    // Private method for rectangle area
	    private double calculateRectangleArea(double length, double width)
	    {
	        return length * width;
	    }

	    // Private static method for triangle area
	    private static double calculateTriangleArea(double base, double height) 
	    {
	        return 0.5 * base * height;
	    }

	    // Public method to calculate and display rectangle area
	    public default void displayRectangleArea(double length, double width) 
	    {
	        double area = calculateRectangleArea(length, width);
	        System.out.println("Rectangle Area: " + area);
	    }

	    // Public method to calculate and display triangle area
	   public static void displayTriangleArea(double base, double height) 
	   {
	        double area = calculateTriangleArea(base, height);
	        System.out.println("Triangle Area: " + area);
	    }
	}

	

