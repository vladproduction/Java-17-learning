package com.vladproduction.control_flow;

import java.util.Scanner;

public class MainVariableScope {
    public static void main(String[] args) {
        //variable scope:
        //variable declared in if block is not visible in else block
        //example:

        // Control flow and variable scope demonstration
        System.out.println("Pick a number between 1 and 10");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // Variable declared inside if block
        if (number < 5) {
            String message = "Your input is less than 5";
            System.out.println(message);
        } else {
            // Uncommenting the following line will cause a compilation error
            // System.out.println(message); // This will not compile, as 'message' is not visible here.
            System.out.println("Your input is greater than or equal to 5");
        }

        // You can still access 'number' here, as its scope is the entire main method
        System.out.println("You picked the number: " + number);
    }
}
