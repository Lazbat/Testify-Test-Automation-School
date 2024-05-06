package org.Tasks;

import java.util.Scanner;

public class Task9B {
    public static void main(String[] args) {
        //Write a logic that takes in input from the user.
        //It keeps printing "try again "until the user enters "testify"
        Scanner scanner = new Scanner(System.in);
        String userInput;
        //using a do-while loop
        do {
            System.out.print("Hello (type 'testify' to exit): ");
            userInput = scanner.nextLine();
            if (!userInput.equals("testify")) {
                System.out.println("Try again");
            }
        } while (!userInput.equals("testify"));

        System.out.println("Welcome");

        scanner.close();
    }
}
