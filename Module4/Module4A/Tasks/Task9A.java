package org.Tasks;

public class Task9A {
    public static void main(String[] args) {
        //I have a list of numbers, 1-10,
        //write a loop that prints odd if it is an odd number
        System.out.println("The Odd numbers:");
        // Loop to print odd numbers
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i + ": odd number");
            }
        }
        //and a loop that prints even if it is an even number.
        System.out.println("The Even numbers:");
        // Loop to print even numbers
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + ": even number");
            }
        }
    }
}