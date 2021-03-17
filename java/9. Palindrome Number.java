// https://leetcode-cn.com/problems/palindrome-number/
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x == 0) return true;
        int tmp = x;
        int result = 0;
        while (tmp != 0) {
            int newresult = result * 10 + tmp % 10;
            int newtmp = tmp / 10;
            if (newresult == 0 && newtmp != 0) return false;
            if (newresult == tmp) return true;
            result = newresult;
            if (newtmp == result) return true;
            tmp = newtmp;
        }
        return false;
    }
}
