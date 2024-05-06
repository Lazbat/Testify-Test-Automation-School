package org.Tasks;

public class Task5 {
    public static void main(String[] args) {
        //Write a code to: If the number is divisible by 3, print Fizz instead of the number.
        //If the number is divisible by 5, print Buzz instead of the number.
        //If the number is divisible by 3 and 5 both, print FizzBuzz instead of the number.

        // Define the number
        int number = 75;

        // Check if the number is divisible by 3 and 5 both
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        }
        // Check if the number is divisible by 3
        else if (number % 3 == 0) {
            System.out.println("Fizz");
        }
        // Check if the number is divisible by 5
        else if (number % 5 == 0) {
            System.out.println("Buzz");
        }
        // If none of the above conditions are met, print the number itself
        else {
            System.out.println(number);
        }
    }
}
