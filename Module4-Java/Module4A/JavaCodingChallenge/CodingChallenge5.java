package JavaCodingChallenge;

import java.util.*;

public class CodingChallenge5 {
    //Create anagram buckets from a given input array of words:
    //input is {"akka", "akak", "baab", "baba", "bbaa"}
    public static void main(String[] args) {
        String[] input = {"akka", "akak", "baab", "baba", "bbaa"};
        Map<String, List<String>> anagramBuckets = createAnagramBuckets(input);

        //Print the anagram buckets
        for (List<String> bucket : anagramBuckets.values()) {
            System.out.println(bucket);
        }
    }
    public static Map<String, List<String>> createAnagramBuckets(String[] words) {
        Map<String, List<String>> anagramBuckets = new HashMap<>();

        for (String word : words) {
            //Sort the characters of the word
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            //Add the word to the corresponding bucket
            if (!anagramBuckets.containsKey(sortedWord)) {
                anagramBuckets.put(sortedWord, new ArrayList<>());
            }
            anagramBuckets.get(sortedWord).add(word);
        }

        return anagramBuckets;
    }
}

