// https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/submissions/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null) return null;
        return func(nums, 0, nums.length - 1);
    }
    TreeNode func(int[] nums, int a, int b) {
        if (a > b) {
            return null;
        }
        int mid = (b - a) / 2 + a;
        TreeNode t = new TreeNode(nums[mid]);
        t.left = func(nums, a, mid - 1);
        t.right = func(nums, mid + 1, b);
        return t;
    }
}
