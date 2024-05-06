package JavaCodingChallenge;

public class CodingChallenge1 {
    //Write Java code to check if racecar and 10801 is a palindrome
    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    //Main function
    public static void main(String[] args) {
        //Input strings
        String A = "racecar";
        String B = "10801";

        boolean isAPalindrome = isPalindrome(A.toLowerCase());
        boolean isBPalindrome = isPalindrome(B);

        System.out.println("Is 'racecar' a palindrome? " + isAPalindrome);
        System.out.println("Is '10801' a palindrome? " + isBPalindrome);
    }
}
