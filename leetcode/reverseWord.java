package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverseWord {
    public static String reverseWords(String s) {
       s=s.trim();
       List<String> wordlist=Arrays.asList(s.split("\\s+"));
       Collections.reverse(wordlist);
       return String.join(" ", wordlist);
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        String t = "hello world";
        System.out.printf(reverseWords(s));
        System.out.println("  ");
        System.out.printf(reverseWords(t));
    }
}
