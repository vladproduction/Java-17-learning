package com.vladproduction.data_types;

public class DataTypeExamples {
    public static void main(String[] args) {
        // Primitive data types
        int intValue = 42;                  // Integer
        long longValue = 123456789L;       // Long
        double doubleValue = 3.14159;      // Double
        float floatValue = 3.14f;          // Float
        char charValue = 'A';               // Character
        boolean booleanValue = true;        // Boolean

        // Print the values
        System.out.println("Integer: " + intValue);
        System.out.println("Long: " + longValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Character: " + charValue);
        System.out.println("Boolean: " + booleanValue);

        // Non-primitive data types
        String stringValue = "Hello, World!"; // String

        // Print the String value
        System.out.println("String: " + stringValue);

        // Array as a non-primitive data type
        int[] arrayValues = {1, 2, 3, 4, 5}; // Array of integers

        // Print the array values
        System.out.print("Array: ");
        for (int value : arrayValues) {
            System.out.print(value + " ");
        }
    }
}
