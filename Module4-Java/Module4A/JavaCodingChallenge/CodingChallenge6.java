package JavaCodingChallenge;

import java.util.*;

public class CodingChallenge6 {
    //Using Java Code, check for Anagrams in these strings:
    //"Despite commuting at the peek hour, she was able to keep to time"
    public static void main(String[] args) {
        String inputString = "Despite commuting at the peak hour, she was able to keep to time";
        Map<String, List<String>> anagramGroups = findAnagrams(inputString);

        //Print the anagram groups
        for (List<String> group : anagramGroups.values()) {
            System.out.println(group);
        }
    }
    public static Map<String, List<String>> findAnagrams(String inputString) {
        //Split the input string into words
        String[] words = inputString.toLowerCase().split("\\s+");

        //Create a map to store anagram groups
        Map<String, List<String>> anagramGroups = new HashMap<>();

        //Iterate through each word
        for (String word : words) {
            //Sort the characters of the word
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            //Add the word to the corresponding anagram group
            if (!anagramGroups.containsKey(sortedWord)) {
                anagramGroups.put(sortedWord, new ArrayList<>());
            }
            anagramGroups.get(sortedWord).add(word);
        }
        return anagramGroups;
    }
}
