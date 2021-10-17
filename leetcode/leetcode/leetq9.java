package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class leetq9 {
    public static String reverseWords(String s) {
        s = s.trim();
        // split by multiple spaces
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        String t = "hello world";
        System.out.printf(reverseWords(s));
        System.out.println("  ");
        System.out.printf(reverseWords(t));
    }
}
