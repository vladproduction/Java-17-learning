package com.vladproduction.classes;

import static com.vladproduction.classes.Rectangle.*;

public class MainRectangle {
    public static void main(String[] args) {
        Rectangle rectangleA = new Rectangle(10,10);
        Rectangle rectangleB = new Rectangle(10,20);
        Rectangle rectangleC = new Rectangle(10,30);
        Rectangle rectangleD = new Rectangle(10,40);

        //calculating area:
        System.out.println("rectangleA Area = " + rectangleA.findArea());
        System.out.println("rectangleB Area = " + rectangleB.findArea());
        System.out.println("rectangleC Area = " + rectangleC.findArea());
        System.out.println("rectangleD Area = " + rectangleD.findArea());

        System.out.println("Total rectangles created: " + getRectangleCount()); // expected 4

        //calling instance variables (depending on concrete object):
        System.out.println(rectangleA.side2);
        System.out.println(rectangleB.side2);
        System.out.println(rectangleC.side2);
        System.out.println(rectangleD.side2);

        //calling the static variable numberOfSides using the class name (depends on the whole class)
        int numbSides = Rectangle.numberOfSides; //to call we have to use directly class name and '.' dot operator
        System.out.println("Number of sides in a rectangle: " + numbSides); // Printing the number of sides
        System.out.println(numberOfSides); //or import static variables (allowed because we do not expect it would be change)






    }
}
