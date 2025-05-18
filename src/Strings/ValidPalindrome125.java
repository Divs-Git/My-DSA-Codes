package Strings;

public class ValidPalindrome125 {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        s = s.toLowerCase();

        while(i <= j) {
            while(i < s.length() - 1 && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while(j > 0 && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            if(i <= j && s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
