package JavaCodingChallenge;

import java.util.Arrays;

public class CodingChallenge8 {
    //Given a collection of 1 million integers, all ranging between 1 to 9, sort them in Big O(n) time
        public static void main(String[] args) {
            //initialize an array counts of size 10 to store the frequencies of integers from 1 to 9.
            int[] numbs = {5, 9, 1, 3, 7, 2, 8, 4, 6, 1, 3, 9, 7, 2, 8, 4, 6, 1, 3, 5, 9, 7, 2, 8, 4, 6, 1, 3, 5, 9, 7, 2, 8, 4, 6,
                    1, 3, 5, 9, 7, 2, 8, 4, 6, 1, 3, 5, 9, 7, 2, 8, 4, 6, 1, 3, 5, 9, 7, 2, 8, 4, 6, 1, 3, 5, 9, 7, 2, 8, 4, 6,
                    1, 3, 5, 9, 7, 2, 8, 4, 6, 1, 3, 5, 9, 7, 2, 8, 4, 6, 1, 3, 5, 9, 7, 2, 8, 4, 6};

            int[] sortedArray = countingSort(numbs);
            System.out.println("Sorted array: " + Arrays.toString(sortedArray));
        }

        public static int[] countingSort(int[] nums) {
            //Count frequencies of each integer
            int[] counts = new int[10];
            for (int num : nums) {
                counts[num]++;
            }

            //Generate sorted array
            int[] sortedArray = new int[nums.length];
            int index = 0;
            for (int i = 1; i <= 9; i++) {
                while (counts[i] > 0) {
                    sortedArray[index++] = i;
                    counts[i]--;
                }
            }
            return sortedArray;
        }
    }

