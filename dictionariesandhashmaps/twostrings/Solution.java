class Result {

    /*
     * Complete the 'twoStrings' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static String twoStrings(String s1, String s2) {
        for(char c : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
            if(s1.indexOf(c) > -1 && s2.indexOf(c) > -1) {
                return "YES";
            }
        }
        return "NO";
    }

}

public class Solution {
    public static void main(String[] args) {
        System.out.println(Result.twoStrings("hello", "world"));
    }
}
