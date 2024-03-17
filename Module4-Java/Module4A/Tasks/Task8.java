package org.Tasks;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        //Build a Simple interest calculator.
        //Write a program to ask the user for the necessary field you need in calculating the simple interest
        //and then communicate the simple interest back to the user in a good sentence
        //Define a Scanner object
        Scanner userInput = new Scanner(System.in);
        //The formula for Simple Interest is (Principal * Rate * Time)/100
        //Request for required information
        System.out.println("Enter the principal amount (in naira): ");
        double principal = userInput.nextDouble();

        System.out.println("Enter the annual rate (in percentage): ");
        int annualRate = userInput.nextInt();

        System.out.println("Enter the time (in years): ");
        int time = userInput.nextInt();

        //Calculate Simple Interest
        double simpleInterest = (principal * annualRate * time)/100;

        //communicate the simple interest back to the user in a good sentence
        System.out.println("The simple interest for the principal amount ₦" + principal +
        ", at an annual interest rate of " + annualRate + "%, " +
                "for a time period of " + time + " years, is ₦" + simpleInterest + " ");

    }
}
