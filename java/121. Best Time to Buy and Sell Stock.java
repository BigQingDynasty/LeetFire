// https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/submissions/
class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) return 0;
        int res = 0;
        int min = 2147453674;
        for (int i = 0;i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            if (prices[i] - min > res) {
                res = prices[i] - min;
            }
        }
        return res;
    }
}
