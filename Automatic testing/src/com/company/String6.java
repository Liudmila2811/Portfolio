package com.company.Array;

public class String6 {
    //Write a Java program to compare two strings lexicographically, ignoring case differences.
    public static void main(String[] args) {
        String str1 = "This is exercise 1";
        String str2 = "This is Exercise 1";


        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println(compareStrings(str1, str2));
    }


    public static String compareStrings(String str1, String str2) {

        // Compare the two strings.
        int result = str1.compareToIgnoreCase(str2);


        // Display the results of the comparison.
        if (result < 0) {
            return ("\"" + str1 + "\"" +
                    " is less than " +
                    "\"" + str2 + "\"");
        } else if (result == 0) {
            return ("\"" + str1 + "\"" +
                    " is equal to " +
                    "\"" + str2 + "\"");
        } else // if (result > 0)
        {
            return ("\"" + str1 + "\"" +
                    " is greater than " +
                    "\"" + str2 + "\"");
        }
    }
}
