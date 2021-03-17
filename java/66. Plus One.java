// https://leetcode-cn.com/problems/plus-one/submissions/
class Solution {
    public int[] plusOne(int[] digits) {
        digits[digits.length - 1] ++;
        for(int i = digits.length - 1; i >= 1; i--) {
            int cur = digits[i];
            if (cur < 10) {
                digits[i] = cur;
            } else {
                int mod = cur % 10;
                int inc = cur / 10;
                digits[i] = mod;
                digits[i - 1] += inc;
            }
        }
        int[] res = null;
        if (digits[0] >= 10)
        {
            res = new int[digits.length+1];
            int mod = digits[0] % 10;
            int inc = digits[0] / 10;
            digits[0] = mod;
            for (int i = digits.length;i >= 1 ;i--) {
                res[i] = digits[i-1];
            }
            res[0] = inc;
        } else {
            res = digits;
        }
        return res;
    }
}
