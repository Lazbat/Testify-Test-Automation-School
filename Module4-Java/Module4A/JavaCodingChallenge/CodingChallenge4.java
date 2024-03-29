package JavaCodingChallenge;

public class CodingChallenge4 {
    //Write a Java code to check for the Prime numbers between 1-100
    //A prime number is a number divisible by only 1 and itself.
    public static void main(String[] args) {
    //Empty String to store prime numbers
    String primeNumbers = "";

    //Loop through numbers from 2 to 100
        for (int i = 2; i <= 100; i++) {
        boolean isPrime = true;

        //Check if the number is divisible by any number between 2 and its square root
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }
        //If the number is prime, append it to the primeNumbers string
        if (isPrime) {
            primeNumbers += i + " ";
        }
    }
        //Print the prime numbers
        System.out.println("Prime numbers from 1 to 100 are:");
        System.out.println(primeNumbers);
}
}
