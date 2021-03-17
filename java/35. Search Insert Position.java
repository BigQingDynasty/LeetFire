// https://leetcode-cn.com/problems/search-insert-position/submissions/
class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length <= 0) return 0;
        return binSearcy(nums, 0, nums.length - 1, target);
    }
    int binSearcy(int[] nums, int start, int end, int target) {
        if (start >= end) {
            if (target < nums[start]) return start;
            else if (target > nums[start]) return start + 1;
        }

        int mid = (start + end) / 2;
        int midV = nums[mid];
        if (target == midV) return mid;
        else if (target < midV) return binSearcy(nums, start, mid - 1, target);
        else if (target > midV) return binSearcy(nums, mid + 1, end, target);
        return 0;
    }
}
