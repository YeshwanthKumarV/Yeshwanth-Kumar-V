package com.string;

public class StringJoinExample {

    public static void main(String[] args) {
        // Example usage
    	String delimiter = ": ";
        String s1 = "Java";
        String s2 = "amber";
        String s3 = "by anudip";

        String result = join(delimiter, s1, s2, s3);
        
        System.out.println(result);
    }

    public static String join(String delimiter, String... elements) 
    {

        StringBuilder result = new StringBuilder(elements[0]);
        for (int i = 1; i < elements.length; i++) 
        {
            result.append(delimiter).append(elements[i]);
        }

        return result.toString();
    }
}