package day1.minmaxsum;

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

    public static void miniMaxSum(List<Integer> arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        long sum = 0;
        for (int item : arr) {
            sum += item;
            min = Math.min(item, min);
            max = Math.max(item, max);
        }
        System.out.println((sum - max) + " " + (sum - min));
    }
}

public class SolutionMinMaxSum {
    public static void main(String[] args) {
        Result.miniMaxSum(List.of(1, 5, 2, 3, 0));
    }
}
