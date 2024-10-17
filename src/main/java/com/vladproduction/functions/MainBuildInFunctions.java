package com.vladproduction.functions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainBuildInFunctions {
    public static void main(String[] args) {

        /**---------------------------------------------String:---------------------------------------------*/
        System.out.println("----String:-----");
        String text = "Hello, World!";

        // Built-in functions
        System.out.println("Length of the string: " + text.length());  // Length of the string
        System.out.println("Substring: " + text.substring(7, 12));      // Extracting substring
        System.out.println("Uppercase: " + text.toUpperCase());         // Convert to uppercase
        System.out.println("Contains 'World': " + text.contains("World")); // Check if contains

        // Splitting a string
        String[] parts = text.split(", ");
        System.out.println("Split string: " + java.util.Arrays.toString(parts));


        /**---------------------------------------------Math:---------------------------------------------*/
        System.out.println("----Math:-----");
        double a = 25.0;
        double b = 4.0;

        // Built-in Math functions
        System.out.println("Square root of " + a + ": " + Math.sqrt(a));  // Square root
        System.out.println("Max of a and b: " + Math.max(a, b));            // Maximum value
        System.out.println("Min of a and b: " + Math.min(a, b));            // Minimum value
        System.out.println("Random number: " + Math.random());              // Random number between 0 and 1
        System.out.println("Power (a^b): " + Math.pow(a, b));               // Power calculation


        /**---------------------------------------------Array:---------------------------------------------*/
        System.out.println("----Array:-----");
        int[] numbers = {5, 3, 8, 1, 2};

        // Sorting an array
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // Filling an array
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 7);
        System.out.println("Filled array: " + Arrays.toString(filledArray));

        // Searching in an array
        int index = Arrays.binarySearch(numbers, 3);
        System.out.println("Index of '3'(as a number) is: " + index);


        /**---------------------------------------------Input/Output:---------------------------------------------*/
        System.out.println("----Input/Output:-----");
        System.out.print("Enter a line of text: ");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String input = reader.readLine();  // Read user input
            System.out.println("You entered: " + input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        /**---------------------------------------------Collections:---------------------------------------------*/
        System.out.println("----Collections:-----");
        ArrayList<String> list = new ArrayList<>();

        // Adding elements to the ArrayList
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");

        // Sorting the list
        Collections.sort(list);
        System.out.println("Sorted list: " + list);

        // Checking if list contains an item
        System.out.println("List contains 'Apple': " + list.contains("Apple"));

        // Removing an item
        list.remove("Banana");
        System.out.println("List after removing Banana: " + list);


    }
}
