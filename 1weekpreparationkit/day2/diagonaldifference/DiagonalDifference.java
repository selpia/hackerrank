package day2.diagonaldifference;

import java.util.List;

class Result {
    public static int diagonalDifference(List<List<Integer>> arr) {
        long diagonal1 = 0;
        long diagonal2 = 0;
        for (int i = 0; i < arr.size(); i++) {
            diagonal1 += arr.get(i).get(i);
            diagonal2 += arr.get(i).get(arr.size() - i - 1);
        }
        return (int) Math.abs(diagonal1 - diagonal2);
    }
}

public class DiagonalDifference {
    public static void main(String[] args) {
        System.out.println(Result.diagonalDifference(List.of(
                List.of(11, 2, 4),
                List.of(4, 5, 6),
                List.of(10, 8, -12))));
    }
}
