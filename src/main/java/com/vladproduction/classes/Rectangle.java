package com.vladproduction.classes;

public class Rectangle {

    // Class variables
    static final int numberOfSides = 4; // Number of sides for a rectangle (constant)
    static int rectangleCount = 0;

    // Instance variables
    double side1;
    double side2;


    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;

        // Increment the count of rectangles created
        rectangleCount++;
    }

    // Instance method to find the area
    public double findArea() {
        return this.side1 * this.side2;
    }

    // Class method to get the count of rectangles created
    public static int getRectangleCount() {
        return rectangleCount;
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5, 10);
        Rectangle rect2 = new Rectangle(4, 8);

        System.out.println("Area of rect1: " + rect1.findArea()); //access by instance only
        System.out.println("Area of rect2: " + rect2.findArea());
        System.out.println("Total rectangles created: " + Rectangle.getRectangleCount()); //access by class
    }
}
