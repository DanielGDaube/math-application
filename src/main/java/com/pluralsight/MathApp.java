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
        double carPrice = 16375.0;
        double truckPrice = 26579.0;
        double lowestPrice = Math.min(carPrice, truckPrice);
        // What is the lowest price?
        System.out.println("The lowest price of the two vehicles is $" + lowestPrice);

        // Radius of a circle
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        // What is the area of the circle?
        System.out.println("The area of the circle is " + area);

        // Declare variable question4Number
        double question4Number = 5.0;
        // Find the square root of question4Number
        double squareRoot = Math.sqrt(5.0);
        // What is the square root of 5.0?
        System.out.println("The square root of " + question4Number + " is " + squareRoot);

        // Declare variables for point coordinates
        int firstPoint_x = 5, firstPoint_y = 10, secondPoint_x =85, secondPoint_y =50;
        // Calculate the distance between the two points
        double distance = Math.sqrt(Math.pow((secondPoint_x - firstPoint_x), 2) + Math.pow((secondPoint_y - firstPoint_y), 2));
        // What is the distance between the two points?
        System.out.println("The distance between the two points is " + distance);

        // Declare variable negativeNumber
        double negativeNumber = -3.8;
        // Find absolute value of negativeNumber
        negativeNumber = Math.abs(-3.8);
        // What is the absolute value of the number?
        System.out.println("The absolute value of -3.8 is " + negativeNumber);

        // Generate a random number between 0 and 1
        double randomNumber = Math.random();
        // What was the random number?
        System.out.println("The random number that was generated is " + randomNumber);

        // Declare starting variables
        int days = 24, hoursPerDay = 24, minutesPerHour = 60, secondsPerMinute = 60, millisecondsPerSecond = 1000;
        // Calculate minutes and milliseconds in 24 days
        int finalHours = Math.multiplyExact(days, hoursPerDay);
        int finalMinutes = Math.multiplyExact(finalHours, minutesPerHour);
        int finalSeconds = Math.multiplyExact(finalMinutes, secondsPerMinute);
        int finalMilliseconds = Math.multiplyExact(finalSeconds, millisecondsPerSecond);
        // How many minutes and how many milliseconds are in 24 days?
        System.out.println("There are " + finalMinutes + " minutes and " + finalMilliseconds + " milliseconds in 24 days");

    }
}
