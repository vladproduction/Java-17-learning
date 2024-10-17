package com.vladproduction.functions;

public class Main2 {
    public static void main(String[] args) {
        double tip = 0.2;
        double tax = 0.05;
        double priceS = 10.0;
        double priceM = 25.0;
        double priceL = 50.0;
        System.out.println(calculateTotal(priceS, tip, tax));
        System.out.println(calculateTotal(priceM, tip, tax));
        System.out.println(calculateTotal(priceL, tip, tax));

    }

    public static double calculateTotal(double price, double tip, double tax){
        double tipRate = tip * price;
        double taxRate = tax * price;
        System.out.print("Total calculation is: ");
        return price + tipRate + taxRate;
    }
}
