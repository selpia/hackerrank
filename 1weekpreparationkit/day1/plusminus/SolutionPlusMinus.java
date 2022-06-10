package day1.plusminus;

import java.util.List;

class Result {

    /*
     * Complete the 'twoStrings' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static void plusMinus(List<Integer> arr) {
        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;
        for (int item : arr) {
            if (item > 0) {
                ++positiveCount;
            } else if (item < 0) {
                ++negativeCount;
            } else {
                ++zeroCount;
            }
        }
        System.out.printf("%.6f%n", (float)positiveCount / arr.size());
        System.out.printf("%.6f%n", (float)negativeCount / arr.size());
        System.out.printf("%.6f%n", (float)zeroCount / arr.size());
    }
}

public class SolutionPlusMinus {
    public static void main(String[] args) {
        Result.plusMinus(List.of(-1, 1, -2, 3, 0));
    }
}
