package com.vladproduction.classes;

import java.util.ArrayList;
import java.util.List;

/**
 * possible to create common classes and interfaces to reach code more flexible
 * in case if we got more shapes to calculate their properties;
 * */
public class MainTriangle {
    public static void main(String[] args) {
        //instances:
        Triangle triangleEQUILATERAL = new Triangle(10, 10, 10); //all sides are equal
        Triangle triangleISOSCELES = new Triangle(10, 10, 15); //two sides are equal
        Triangle triangleSCALENE = new Triangle(10, 15, 20); //all sides are different

//        triangles_methods_handler(triangleEQUILATERAL, triangleISOSCELES, triangleSCALENE);

        summary_triangles(triangleEQUILATERAL, triangleISOSCELES, triangleSCALENE);


    }

    private static void triangles_methods_handler(Triangle triangleEQUILATERAL, Triangle triangleISOSCELES, Triangle triangleSCALENE) {
        //testing toString():
        System.out.println(triangleEQUILATERAL);
        System.out.println(triangleISOSCELES);
        System.out.println(triangleSCALENE);

        //identifying type of triangle:
        TypeTriangle triangleE = triangleEQUILATERAL.identityTriangleType();
        TypeTriangle triangleI = triangleISOSCELES.identityTriangleType();
        TypeTriangle triangleS = triangleSCALENE.identityTriangleType();

        //calculating height of triangle:
        double heightTriangleE = triangleEQUILATERAL.calculateHeightBasedOnTypeOfTriangle(triangleE);
        System.out.printf("heightTriangleE = %.2f%n", heightTriangleE);

        double heightTriangleI = triangleISOSCELES.calculateHeightBasedOnTypeOfTriangle(triangleI);
        System.out.printf("heightTriangleI = %.2f%n", heightTriangleI);

        double heightTriangleS = triangleSCALENE.calculateHeightBasedOnTypeOfTriangle(triangleS);
        System.out.printf("heightTriangleS = %.2f%n", heightTriangleS);

        //calculating area:
        double areaTriangleE = triangleEQUILATERAL.calculateTriangleArea(triangleE);
        System.out.printf("areaTriangleE = %.2f%n", areaTriangleE);

        double areaTriangleI = triangleISOSCELES.calculateTriangleArea(triangleI);
        System.out.printf("areaTriangleI = %.2f%n", areaTriangleI);

        double areaTriangleS = triangleSCALENE.calculateTriangleArea(triangleS);
        System.out.printf("areaTriangleS = %.2f%n", areaTriangleS);

        //calculating perimeter:
        double perimeterTriangleE = triangleEQUILATERAL.calculatePerimeterOfTriangle();
        System.out.printf("perimeterTriangleE = %.0f%n", perimeterTriangleE);

        double perimeterTriangleI = triangleISOSCELES.calculatePerimeterOfTriangle();
        System.out.printf("perimeterTriangleI = %.0f%n", perimeterTriangleI);

        double perimeterTriangleS = triangleSCALENE.calculatePerimeterOfTriangle();
        System.out.printf("perimeterTriangleS = %.0f%n", perimeterTriangleS);
    }

    private static void summary_triangles(Triangle triangleEQUILATERAL, Triangle triangleISOSCELES, Triangle triangleSCALENE) {
        System.out.println("SUMMARY:");
        for (Triangle triangle : new ArrayList<>(List.of(triangleEQUILATERAL, triangleISOSCELES, triangleSCALENE))) {
            triangle.summary();
        }
    }
}
