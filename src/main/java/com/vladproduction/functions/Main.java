package com.vladproduction.functions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome in main:");
        function();
        System.out.println("Writing code");
        Scanner newScanner = new Scanner(System.in);
        if(newScanner.next().equals("Reviewed")){
            System.out.println("Your code reviewed!");
        }else {
            System.out.println("Code is not reviewed yet.");
        }
        function();
        System.out.println("Enjoy process!");

    }

    public static void function(){
        System.out.println("starting function...");
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        System.out.println(inputNumber + " is you number!");
    }
}
