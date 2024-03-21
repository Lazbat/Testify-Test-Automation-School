package org.Tasks;

import java.util.Scanner;

public class Task18 {
    //Write a code that asks the user for age and that accepts the Integer value.
    //Handle the error that is encountered when the users tries to enter a name instead of age.
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        try {
            //Request for user age
            System.out.print("Enter your age: ");
            int age = userInput.nextInt();

            //Printout the entered age
            System.out.println("Your age is: " + age);
        } catch (Exception exception) {
            //Handle the error where the user enters a non-integer value
            System.out.println("Invalid input! Please enter a valid integer value for age.");
            System.out.println(exception);

            // Close the scanner
            userInput.close();
        }
    }
}