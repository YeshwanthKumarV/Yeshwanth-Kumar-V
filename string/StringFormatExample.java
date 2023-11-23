package com.string;

public class StringFormatExample 
{
    public static void main(String[] args) 
    {
        String name = "Java";
        int age = 23;
        double height = 5.8;

        // Using String.format to format the string
     String formattedString = String.format("Name: %s, Age: %d, Height: %.2f feet", name, age, height);

        // Printing the formatted string
        System.out.println(formattedString);
    }
}