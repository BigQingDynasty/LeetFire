// https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/submissions/
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null) return 0;
        if (nums.length <= 1) return nums.length;
        int j = 1;
        int cur = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (cur != nums[i]) {
                nums[j] = nums[i];
                cur = nums[j];
                j++;
            }
        }
        return j;
    }
}
