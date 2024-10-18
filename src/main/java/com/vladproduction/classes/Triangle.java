package com.vladproduction.classes;

import java.util.Arrays;

import static com.vladproduction.classes.ShapeType.TRIANGLE;
import static com.vladproduction.classes.TypeTriangle.*;

public class Triangle {
    public static final ShapeType SHAPE_TYPE_TRIANGLE = TRIANGLE; //class attribute (associated to the class) - static

    //attributes (instance variables)
    double side1;
    double side2;
    double base;
    TypeTriangle typeTriangle;

    //constructor with parameters:
    public Triangle(double side1, double side2, double base) {
        this.side1 = side1;
        this.side2 = side2;
        this.base = base;
        this.typeTriangle = identityTriangleType();
    }

    //identifying type of triangle:
    public TypeTriangle identityTriangleType(){
        if (this.side1 == this.side2 && this.side2 == this.base) {
            return EQUILATERAL; // All sides are equal
        } else if (this.side1 == this.side2 || this.side1 == this.base || this.side2 == this.base) {
            return TypeTriangle.ISOSCELES; // Two sides are equal
        } else {
            return TypeTriangle.SCALENE; // All sides are different
        }
    }

    //calculate area of triangle:
    public double calculateTriangleArea(TypeTriangle typeTriangle){
        if (typeTriangle == TypeTriangle.EQUILATERAL) {
            return (this.base * calculateHeightBasedOnTypeOfTriangle(TypeTriangle.EQUILATERAL)) / 2;
        } else if (typeTriangle == TypeTriangle.ISOSCELES) {
            // Calculate height for isosceles triangle
            double height = calculateHeightBasedOnTypeOfTriangle(TypeTriangle.ISOSCELES);
            return (this.base * height) / 2;
        } else {
            // Calculate area for scalene triangle using Heron's formula
            double s = (side1 + side2 + base) / 2; // semi-perimeter
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - base));
        }
    }

    //calculate the height of triangle:
    public double calculateHeightBasedOnTypeOfTriangle(TypeTriangle typeTriangle) {
        if(typeTriangle == EQUILATERAL){
            //calculation height in case type of triangle is EQUILATERAL
            return (Math.sqrt(3) / 2) * base; // base serves as the length of the side here
        } else if (typeTriangle == ISOSCELES) {
            // Calculate height for isosceles triangle using Pythagorean theorem
            // Assume side1 is the equal side and base is the base
            double halfBase = base / 2;
            return Math.sqrt(side1 * side1 - halfBase * halfBase);
        } else {
            // For scalene triangle, height calculation requires base and perpendicular length
            // It can't be computed without additional information (not provided)
            // Returning 0 here, as height calculation is not straightforward without more data.
            return 0; // Placeholder
        }
    }

    //calculate perimeter of the triangle:
    public double calculatePerimeterOfTriangle() {
        return side1 + side2 + base;
    }



    //overridden toString():
    @Override
    public String toString() {
        return SHAPE_TYPE_TRIANGLE + ": " + typeTriangle + ", " + side1 + ", " + side2 + ", " + base + ";";
    }

    //presenting the full information about current shape
    //SHAPE: TRIANGLE, TYPE: EQUILATERAL sides(1, 2, and base) [10.0, 10.0, 10.0], height: 8.7, area: 43.3, perimeter: 30.0
    public void summary(){
        StringBuilder sb = new StringBuilder();
        sb.append("SHAPE: ");
        sb.append(SHAPE_TYPE_TRIANGLE);
        sb.append(", TYPE: ");
        sb.append(typeTriangle);
        sb.append(", sides: ");
        sb.append(Arrays.toString(new double []{side1, side2, base}));

        // formatting height and area to one decimal place
        sb.append(", height: ");
        sb.append(String.format("%.1f", calculateHeightBasedOnTypeOfTriangle(typeTriangle))); // Height formatted to 1 decimal place
        sb.append(", area: ");
        sb.append(String.format("%.1f", calculateTriangleArea(typeTriangle))); // Area formatted to 1 decimal place

        sb.append(", perimeter: ");
        sb.append(calculatePerimeterOfTriangle());
        System.out.println(sb);
    }


}
