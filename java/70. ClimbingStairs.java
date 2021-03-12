// https://leetcode-cn.com/problems/climbing-stairs/submissions/
class Solution {
    public int climbStairs(int n) {
        if(n <= 2) return n;
        int[] fn = new int[n + 1];        
        fn[1] = 1;
        fn[2] = 2;
        for( int i = 3;i <= n ;i++) {
            fn[i] = fn[i - 1] + fn[i - 2];
        }
        return fn[n];
    }
}
