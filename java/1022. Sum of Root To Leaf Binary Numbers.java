// https://leetcode-cn.com/problems/sum-of-root-to-leaf-binary-numbers/
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
    public int sumRootToLeaf(TreeNode root) {
        return func(root, 0);
    }
    int func(TreeNode root, int sum) {
        if (root == null) return 0;
        int rootsum = sum * 2 + root.val;
        if (root.left == null && root.right == null) return rootsum;
        int left = func(root.left, rootsum);
        int right = func(root.right, rootsum);
        return left + right;
    }
}
