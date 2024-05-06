package JavaCodingChallenge;

public class CodingChallenge7 {
    //Reverse "TestifyAutomation" using recursion in Java
    public static void main(String[] args) {
        String input = "TestifyAutomation";
        String reversedString = reverseString(input);
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversedString);
    }
    public static String reverseString(String str) {
        //Base case:If the string is empty or has only one character, return it as is
        if (str.isEmpty() || str.length() == 1) {
            return str;
        } else {
            //Recursive step: Swap the first and last characters and reverse the substring in between
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }
}
