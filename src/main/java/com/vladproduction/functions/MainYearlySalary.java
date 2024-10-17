package com.vladproduction.functions;

public class MainYearlySalary {
    public static void main(String[] args) {
        double hoursPerWeek = 40;
        double amountPerHour = 20;
        double result = MainYearlySalary.calculateYearlySalary(hoursPerWeek, amountPerHour);
        System.out.println("result = " + result);

        double hoursPerWeekT2 = 85.5;
        double amountPerHourT2 = 35;
        double result2 = MainYearlySalary.calculateYearlySalary(hoursPerWeekT2, amountPerHourT2);
        System.out.println("result2 = " + result2);

        double hoursPerWeekT3 = 0;
        double amountPerHourT3 = 35;
        double result3 = MainYearlySalary.calculateYearlySalary(hoursPerWeekT3, amountPerHourT3);
        System.out.println("result3 = " + result3);

        double hoursPerWeekT4 = 85.5;
        double amountPerHourT4 = -2;
        double result4 = MainYearlySalary.calculateYearlySalary(hoursPerWeekT4, amountPerHourT4);
        System.out.println("result4 = " + result4);

    }

    static double calculateYearlySalary(double hoursPerWeek, double amountPerHour) {
        int weeksInYear = 52;
        //(both parameters are not expected to be less than '0')
        if(hoursPerWeek < 0 || amountPerHour < 0){ //one of the condition is false - the wool is fail
            return 0;
        }
        return weeksInYear * hoursPerWeek * amountPerHour;
    }
}
