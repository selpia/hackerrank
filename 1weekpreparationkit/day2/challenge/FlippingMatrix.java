package day2.challenge;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Result {
    public static int flippingMatrix(List<List<Integer>> matrix) {
        int n = matrix.size() / 2;
        int total = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                int max = Integer.MIN_VALUE;
                max = Math.max(max, matrix.get(i).get(j));
                max = Math.max(max, matrix.get(i).get(2 * n - j - 1));
                max = Math.max(max, matrix.get(2 * n - i -  1).get(j));
                max = Math.max(max, matrix.get(2 * n - i - 1).get(2 * n - j - 1));
                total += max;
            }
        }
        return total;
    }
}

public class FlippingMatrix {
    public static void main(String[] args) {
        System.out.println(Result.flippingMatrix(List.of(
                List.of(15, 2, 3, 8),
                List.of(11, 2, 4, 8),
                List.of(4, 5, 6, 9),
                List.of(10, 8, -12, 5))));
    }
}
