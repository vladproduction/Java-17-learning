package com.vladproduction.control_flow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //control flow
        //by boolean expression presented relational operators (<,>,<=,>=,||,&&)
        //or if or else can be executed, not both
        /*System.out.println("Pick a number between 1 na 10");
        Scanner input = new Scanner(System.in);
        if (input.nextInt() < 5){
            System.out.println("Your input is less than 5");
        }else {
            System.out.println("Your input is greater than 5");
        }*/

        for (int num = 0; num < 10; num++) {
            System.out.println(num);
        }
        System.out.println("---");
        for (int num = 1; num <= 10; num++) {
            System.out.println(num);
        }
    }
}
