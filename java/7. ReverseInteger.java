// https://leetcode-cn.com/problems/reverse-integer/
class Solution {
    public int reverse(int x) {
        int tmp = x;
        int result = 0;
        while (tmp!=0) {
            if (result > Integer.MAX_VALUE / 10 || result < -Integer.MAX_VALUE / 10)
                return 0;
            result = result * 10 + tmp % 10;
            tmp /= 10;
        }
        return result;
    }
}
