// https://leetcode-cn.com/problems/valid-palindrome/submissions/
class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) return false;
        if (s.length() <= 1) return true;
        int i = 0, j = s.length() -1 ;
        while(i < j) {
            while(i < j && !isLetterNum(s.charAt(i))) i++;
            while(i < j && !isLetterNum(s.charAt(j))) j--;
            if (!equalIgnore(s.charAt(i), s.charAt(j))) return false;
            else {
                i++;
                j--;
            }
        }
        return true;
    }
    boolean isLetterNum(char c) {
        if (c >= 'a' && c <= 'z') return true;
        if (c >= 'A' && c <= 'Z') return true;
        if (c >= '0' && c <= '9') return true;
        return false;
    }
    boolean isLetter(char c) {
        if (c >= 'a' && c <= 'z') return true;
        if (c >= 'A' && c <= 'Z') return true;
        return false;
    }
    boolean equalIgnore(char a, char b) {
        if (isLetter(a) && isLetter(b)) {
            return a == b || (Math.abs(a - b) == 32);
        }
        return a == b;
    }
}
