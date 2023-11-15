package com.staticc;

public class AdditionProgram {

    

    // Static block
    static {
        System.out.println("Initializing AdditionProgram...");
    }

    // Constructor 
    public AdditionProgram() {
    	System.out.println("constructor");
    }

    // Static method for addition
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 10;      
        int sum = add(number1, number2);
        AdditionProgram a1=new AdditionProgram();
        System.out.println("Sum: " + sum);
        
    }
}