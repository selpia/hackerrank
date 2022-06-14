package day3.caesarcipher;

import java.util.Arrays;

class Result {
    public static String caesarCipher(String s, int k) {
        String symbols = "abcdefghijklmnopqrstuvwxyz";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; ++i) {
            char c = chars[i];
            int index = symbols.indexOf(Character.toLowerCase(c));
            if (index != -1) {
                int newIndex = index + k;
                newIndex %= symbols.length();
                char newChar = symbols.charAt(newIndex);
                if (Character.isUpperCase(c)) {
                    newChar = Character.toUpperCase(newChar);
                }
                chars[i] = newChar;
            }
        }
        return String.valueOf(chars);
    }
}

public class CaesarCipher {
    public static void main(String[] args) {
        System.out.println(Result.caesarCipher("middle-Outz", 2));
    }
}
