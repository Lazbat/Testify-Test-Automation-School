package JavaCodingChallenge;

public class CodingChallenge3 {
    //Find two numbers of which the product is maximum in an array
    //Array: [2, 3, 5, 7, -7, 5, 8, -5]
    static void maxProduct(int arr[], int n) {
        if (n < 2) {
            System.out.println("No pairs exist");
            return;
        }
        //Initialize max positive and max negative numbers
        int maxPositive1 = Integer.MIN_VALUE, maxPositive2 = Integer.MIN_VALUE;
        int maxNegative1 = Integer.MAX_VALUE, maxNegative2 = Integer.MAX_VALUE;

        //Find the two maximum positive numbers and two maximum negative numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] >= maxPositive1) {
                maxPositive2 = maxPositive1;
                maxPositive1 = arr[i];
            } else if (arr[i] > maxPositive2) {
                maxPositive2 = arr[i];
            }

            if (arr[i] <= maxNegative1) {
                maxNegative2 = maxNegative1;
                maxNegative1 = arr[i];
            } else if (arr[i] < maxNegative2) {
                maxNegative2 = arr[i];
            }
        }
        //Compare the products of the maximum positive pair and the maximum negative pair
        if ((long) maxPositive1 * maxPositive2 > (long) maxNegative1 * maxNegative2) {
            System.out.println("Max product pair is {" + maxPositive1 + ", " + maxPositive2 + "}");
        } else {
            System.out.println("Max product pair is {" + maxNegative1 + ", " + maxNegative2 + "}");
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 7, -7, 5, 8, -5};
        int n = arr.length;
        maxProduct(arr, n);
    }
}
