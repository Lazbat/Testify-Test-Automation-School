package JavaCodingChallenge;

public class CodingChallenge2 {
    //Reverse the position of words in "I am the best Automation Tester" using recursion
    public static void main(String[] args) {
        String sentence = "I am the best Automation Tester";
        String reversedSentence = reverseWords(sentence);
        System.out.println("Original sentence: " + sentence);
        System.out.println("Reversed sentence: " + reversedSentence);
    }
    //Method to reverse the position of words in a string using recursion
    public static String reverseWords(String sentence) {
        //Base case:If the sentence is empty or contains only one word, return it as is
        if (sentence.isEmpty() || !sentence.contains(" ")) {
            return sentence;
        } else {
            //Split the sentence into words
            String[] words = sentence.split(" ");

            //Remove the first word from the array
            String firstWord = words[0];
            String remainingWords = sentence.substring(firstWord.length() + 1);

            //Recursively reverse the remaining words
            String reversedWords = reverseWords(remainingWords);

            //Concatenate the first word and the reversed remaining words
            return reversedWords + " " + firstWord;
        }
    }
    }
