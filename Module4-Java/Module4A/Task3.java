package org.example;

public class StringAndConcat {
    public static void main(String[] args) {
        //Create a variable and store your age in it.
        int age = 34;
        // concatenate your age with a string and print it out on the console using the two methods of conacatenation you were taught
        //Method 1
        String howOld = "I am ";
        String yearsOld = " years old.";
        //String myAge = howOld + age + yearsOld;
        System.out.println(howOld + age + yearsOld);

        //Method 2: .concat()method
        String myAge = "My age: ";
        myAge = myAge.concat(howOld + age + yearsOld);
        System.out.println(myAge);
    }
}
