package com.company;

public class Circle {

    public static void area(double radius){
        double area = (Math.PI*(radius * radius));
        System.out.println("Area of circle: " + area);
  }

    public static void circumference(double radius){
        double area = Math.PI * 2 * radius;
        System.out.println("Circumference of circle: " + area);
    }
}