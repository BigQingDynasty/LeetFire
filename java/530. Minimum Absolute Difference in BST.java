// https://leetcode-cn.com/problems/minimum-absolute-difference-in-bst/submissions/
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
    TreeNode prev;
    int min;
    public int getMinimumDifference(TreeNode root) {
        min = 2147483647;
        getMin(root);
        return min;
    }
    void getMin(TreeNode root) {
        if (root != null) {
            getMin(root.left);
            if (prev == null) {
                prev = root;
            } else {
                min = Math.min(min, Math.abs(root.val - prev.val));
                prev = root;
            }
            getMin(root.right);
        }
    }
}
