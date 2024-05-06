package org.Tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        //Create a method that verify that visitors on the slack channel are coming for testify Trainings.
        //If they write "Testify" then print out a welcome messsage if not, the user should be shown rejection message.
        //after creating this method,then invoke the created method in your main method

        // Invoke the verifyAttendance method
        Task10 methodVar = new Task10();
        methodVar.verifyAttendance();
    }

    // Method to verify attendance
    public void verifyAttendance() {
        Scanner scanner = new Scanner(System.in);

        // Prompt the visitor for input
        System.out.print("Are you here for Testify Trainings? ");
        String input = scanner.nextLine();

        // Check if the visitor entered "Testify"
        if (input.equalsIgnoreCase("Testify")) {
            System.out.println("Welcome to Testify Trainings.");
        } else {
            System.out.println("Sorry, you're not authorized to access Testify Trainings.");
        }

        // Close the scanner
        scanner.close();
    }
}


