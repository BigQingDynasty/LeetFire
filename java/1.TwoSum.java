// https://leetcode-cn.com/problems/two-sum/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int right = target - nums[i];
            Integer pos = (Integer) map.get(right);
            if (pos != null && pos != i) {
                return new int[]{i, pos};
            }
        }
        return null;
    }
}
