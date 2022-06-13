package day2.lonelyinteger;

import java.util.*;

class Result {
    public static int lonelyinteger(List<Integer> integers) {
        Set<Integer> set = new HashSet<>(integers);
        int setSum = set.stream().reduce(0, Integer::sum);
        int arrSum = integers.stream().reduce(0, Integer::sum);
        return setSum * 2 - arrSum;
    }
}

public class LonelyInteger {
    public static void main(String[] args) {
        System.out.println(Result.lonelyinteger(List.of(1, 2, 1, 2, 5)));
    }
}
