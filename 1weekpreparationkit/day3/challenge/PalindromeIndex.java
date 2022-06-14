package day3.challenge;

class Result {
    public static int palindromeIndex(String s) {
        if (isPalindrome(s)) {
            return -1;
        }
        for (int i = 0; i < s.length(); ++i) {
            StringBuilder sb = new StringBuilder(s);
            if (isPalindrome(sb.deleteCharAt(i).toString())) {
                return i;
            }
        }
        return -1;
    }

    private static boolean isPalindrome(String s) {
        int i = 0; int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++; j--;
        }
        return true;
    }

}

public class PalindromeIndex {
    public static void main(String[] args) {
        System.out.println(Result.palindromeIndex("aaab"));
    }
}
