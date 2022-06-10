package day1.timeconversion;

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

    public static String timeConversion(String s) {
        int hours = Integer.parseInt(s.substring(0, 2), 10);
        String format = s.substring(s.length() - 2);
        hours = format.equals("PM") && hours != 12 ? hours + 12 : hours;
        hours = format.equals("AM") && hours == 12 ? 0 : hours;
        return String.format("%02d", hours) + s.substring(2, s.length() - 2);
    }
}

public class Solution {
    public static void main(String[] args) {
        System.out.println(Result.timeConversion("12:40:22AM"));
    }
}
