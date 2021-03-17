// https://leetcode-cn.com/problems/path-sum/submissions/
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return check(root,targetSum);
    }
    boolean check(TreeNode root, int sum) {
        if (root == null) return false;
        if (root.left == null && root.right == null) {
            if (root.val == sum) return true;
            else return false;
        }
        if (root.left == null) return check(root.right, sum - root.val);
        if (root.right == null) return check(root.left, sum - root.val);
        return check(root.left, sum - root.val) || check(root.right, sum - root.val);
    }
}
