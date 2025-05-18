package Strings;

//https://leetcode.com/problems/largest-odd-number-in-string/

public class Q1903 {
    public String largestOddNumber(String num) {
        String res = "";
        for(int i = num.length() - 1 ; i >= 0 ; i--) {
            int n = num.charAt(i) - '0';
            if(n % 2 != 0) {
                res = num.substring(0,i + 1);
                break;
            }
        }
        return res;
    }
}
