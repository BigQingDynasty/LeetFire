// https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof/submissions/
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
    public TreeNode mirrorTree(TreeNode root) {
        return swap(root);
    }
    TreeNode swap(TreeNode root) {
        if (root == null) return null;
        if (root.left == null && root.right == null) return root;
        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;
        swap(root.left);
        swap(root.right);
        return root;
    }
}
