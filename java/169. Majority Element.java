// https://leetcode-cn.com/problems/majority-element/submissions/
class Solution {
    public int majorityElement(int[] nums) {
        if (nums == null || nums.length <= 0) return -1;
        int res = 0, count = 0;
        for(int i = 0;i < nums.length ;i++) {
            if (count == 0) res = nums[i];
            if (res == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return res;
    }
}
