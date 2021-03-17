// https://leetcode-cn.com/problems/remove-element/
class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length <= 0) return 0;
        int i = 0, j = nums.length -1;
        int res = 0;
        while (i <= j && j >= 0) {
            while( i <= j && j >= 0 && nums[j] == val) j--;
            if (i > j) break;
            if (nums[i] == val) {
                nums[i] = nums[j];
                j--;
                i++;
                res++;
            } else {
                i++;
                res++;
            }
        }
        return res;
    }
}
