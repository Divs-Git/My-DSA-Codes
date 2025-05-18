package Strings;

//https://leetcode.com/problems/largest-substring-between-two-equal-characters/

public class Q1634 {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] indices = new int[26];
        int max = -1;

        for(int i = 0 ; i < s.length() ; i++) {
            int idx = s.charAt(i) - 'a';
            if(indices[idx] > 0) {
                max = Math.max(i - indices[idx],max);
            } else {
                indices[idx] = i + 1;
            }
        }

        return max;
    }
}
