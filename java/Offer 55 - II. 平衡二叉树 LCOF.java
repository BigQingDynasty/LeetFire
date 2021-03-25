// https://leetcode-cn.com/problems/ping-heng-er-cha-shu-lcof/submissions/
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
        boolean isLeft = isBalanced(root.left);
        int a = height(root.left);
        int b = height(root.right);
        boolean is = Math.abs(a - b) <= 1;
        boolean isRight = isBalanced(root.right);
        return isLeft && is && isRight;
    }
    int height(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        return 1 + Math.max(height(root.left), height(root.right));
    } 
}
