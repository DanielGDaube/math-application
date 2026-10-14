package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Bob and Gary's salaries
        int bobSalary = 75000;
        int garySalary = 83000;
        int highestSalary = Math.max(bobSalary, garySalary);
        // What is the highest salary?
        System.out.println("The highest salary is $" + highestSalary + " a year");

        // Prices of a car and a truck
        int carPrice = 16375;
        int truckPrice = 26579;
        int lowestPrice = Math.min(carPrice, truckPrice);
        // What is the lowest price?
        System.out.println("The lowest price of the two vehicles is $" + lowestPrice);

        // Radius of a circle
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        // What is the area of the circle?
        System.out.println("The area of the circle is " + area);

        // Set question4Number to 5.0
        double question4Number = 5.0;
        // Find the square root of question4Number
        double squareRoot = Math.sqrt(5.0);
        // What is the square root of 5.0?
        System.out.println("The square root of " + question4Number + " is " + squareRoot);
    }
}
