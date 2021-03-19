// https://leetcode-cn.com/problems/minimum-height-tree-lcci/submissions/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length <= 0) return null;
        return gen(nums, 0, nums.length - 1);
    }
    TreeNode gen(int[] nums, int a, int b) {
        if (a > b) return null;
        TreeNode res = null;
        int mid = (b - a) / 2 + a;
        res = new TreeNode(nums[mid]);
        res.left = gen(nums, a, mid - 1);
        res.right = gen(nums, mid + 1, b);
        return res;
    }
}
