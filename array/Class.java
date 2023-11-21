package com.array;

public class Class 
{
	public static void main(String[] args) 
	{
        // Define two matrices
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        // Get dimensions
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
       
        System.out.println(rows1);
        System.out.println(cols1);
        System.out.println(cols2);

        

	}
}
