package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class leetq9 {
    public String reverseWords(String s) {
        s = s.trim();
        // split by multiple spaces
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }
}
