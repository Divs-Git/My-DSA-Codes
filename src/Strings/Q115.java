package Strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//https://leetcode.com/problems/reverse-words-in-a-string/

public class Q115 {
    public String reverseWords(String s) {
        s = s.trim();
        List<String> wordList = Arrays.asList(s.split("\\s+"));

        Collections.reverse(wordList);

        return String.join(" ",wordList);
    }
}
