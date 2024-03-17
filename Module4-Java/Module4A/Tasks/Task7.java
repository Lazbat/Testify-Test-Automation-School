package org.Tasks;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        //create a two dimensional array with 4 rows and 3 columns.
        String [][] fruitsArray = new String[4][3];

        // Fill only the first column with any fruits of ur choice
        fruitsArray[0][0] = "Pineapple";
        fruitsArray[1][0] = "Watermelon";
        fruitsArray[2][0] = "Apple";
        fruitsArray[3][0] = "Oranges";

        System.out.println(Arrays.deepToString(fruitsArray));


    }
}
