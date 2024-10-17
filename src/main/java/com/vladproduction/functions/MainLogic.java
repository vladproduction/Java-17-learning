package com.vladproduction.functions;

import java.util.Scanner;

public class MainLogic {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the program. Please select an option:");
            System.out.println("1. Call function to enter a number");
            System.out.println("2. Check if code is reviewed");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");

            int choice = newScanner.nextInt();

            switch (choice) {
                case 1:
                    function();
                    break;
                case 2:
                    checkIfReviewed(newScanner);
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    newScanner.close();
                    return;  // Exit the main method
                default:
                    System.out.println("Invalid choice, please enter a number between 1 and 3.");
            }
        }
    }

    public static void function() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Starting function...");
        System.out.print("Enter a number: ");

        // Validate the input
        while (!scanner.hasNextInt()) {
            System.out.println("That's not a valid number. Please enter an integer.");
            scanner.next(); // Clear the invalid input
        }

        int inputNumber = scanner.nextInt();
        System.out.println(inputNumber + " is your number!");
    }

    public static void checkIfReviewed(Scanner scanner) {
        System.out.print("Please enter 'Reviewed' to check the code review status: ");
        String userInput = scanner.next();

        if (userInput.equalsIgnoreCase("Reviewed")) {
            System.out.println("Your code has been reviewed!");
        } else {
            System.out.println("Code is not reviewed yet.");
        }
    }
}
