// https://leetcode-cn.com/problems/sqrtx/submissions/
class Solution {
    public int mySqrt(int x) {
        if (x <= 0) return 0;
        int a = 0, b = x;
        int res = 1;
        while(a <= b) {
            int mid = (b - a) / 2 + a;
            if((long)mid * mid <= x)
            {
                res = mid;
                a = mid + 1;
            } else {
                b = mid - 1;
            }    
        }
        return res;
    }
}
