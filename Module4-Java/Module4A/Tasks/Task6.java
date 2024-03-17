package org.Tasks;

public class Task6 {
    public static void main(String[] args) {
        //Write a code to reverse the string DEMOCRACY and get the word COME out of it.
        //code to reverse the string DEMOCRACY
        // Define original string
        String originalString = "DEMOCRACY";

        // Empty string to store the reversed string
        String reversedString = "";

        // Iterate through the original string in reverse order and append characters to reversedString
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString += originalString.charAt(i);
        }
        // Print the reversed string YCARCOMED
        System.out.println("Reversed string: " + reversedString);

        //Get the word COME out of it.
        reversedString.substring(4, 8);
        System.out.println(reversedString.substring(4, 8));
    }
}
