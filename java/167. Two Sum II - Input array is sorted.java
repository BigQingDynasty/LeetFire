// https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/submissions/
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a = 0, b = numbers.length - 1;
        while (a < b) {
            int x = numbers[a] + numbers[b];
            if (x == target)
                return new int[]{a + 1, b + 1};
            else if (x < target) {
                a++;
            } else {
                b--;
            }
        }
        return new int[]{-1, -1};
    }
}
