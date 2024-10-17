package com.vladproduction.data_types;

public class MainString {
    public static void main(String[] args) {

        String studentName = "John Doe";
        String firstName = "John";
        String lastName = "Doe";

        System.out.println("studentName = " + studentName);
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);

        //access to chars of string:
        char charAtStudentFirst = studentName.charAt(0);
        System.out.println("charAtStudentFirst = " + charAtStudentFirst);

        //concatenation:
        double gpa = 3.45;
        System.out.println(firstName + " " + lastName + " " + gpa);


    }
}
