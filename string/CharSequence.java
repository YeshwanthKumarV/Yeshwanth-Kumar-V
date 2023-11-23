package com.string;

public class CharSequence {

    public static void main(String[] args) {
        String mainSequence = "Ms Dhoni";
        String subSequence = " Dhoni";
        boolean result = contains(mainSequence, subSequence);
        System.out.println("Does the main sequence contain the subsequence? " + result);
    }
    private static boolean contains(String mainSequence, String subSequence) 
    {
        return mainSequence.toString().contains(subSequence);
    }
}