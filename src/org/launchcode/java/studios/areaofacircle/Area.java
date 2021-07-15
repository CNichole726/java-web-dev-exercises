package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Hello, what is the radius of your circle?:");
//        double radius = input.nextDouble();
//        double area = Math.PI * radius * radius;
//
//        System.out.println("Area =" + area);
//    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the circle radius: ");
        String userInput = input.nextLine();
        try {
            double radius = Double.parseDouble(userInput);

            if (radius < 0) {
                System.out.println("Please enter a positive circle radius: ");
                System.exit(0);
            }

            Double area = Circle.calculateCircleArea(radius);
            System.out.println("The area of a circle with radius " + radius + " is: " + area);
        } catch (NumberFormatException nfe) {
            System.out.println("Please enter a numeric circle radius.");
            System.exit(0);
        }

//    public static double calculateCircleArea(double userRadius){
//        return Math.PI * userRadius * userRadius;
//    }
    }
}
