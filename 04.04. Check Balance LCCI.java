// https://leetcode-cn.com/problems/check-balance-lcci/submissions/
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
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        boolean left = isBalanced(root.left);
        boolean right = isBalanced(root.right);
        return left && right && (Math.abs(height(root.left) - height(root.right)) <= 1);
    }
    int height(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null) return 1;
        return Math.max(height(root.left), height(root.right)) + 1;
    }
}
