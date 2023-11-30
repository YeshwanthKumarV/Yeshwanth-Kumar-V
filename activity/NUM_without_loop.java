package com.activity;
/*Print numbers 1 to 100 without using any loop in code*/
public class NUM_without_loop
{
	 static void printNumbers(int n) {
	        if (n <= 100) {
	            System.out.println(n);
	            printNumbers(n + 1);
	        }
	    }

	    public static void main(String[] args) {
	        printNumbers(1);
	    }

}
