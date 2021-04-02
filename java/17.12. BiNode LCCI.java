// https://leetcode-cn.com/problems/binode-lcci/submissions/
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
    public TreeNode convertBiNode(TreeNode root) {
        TreeNode head = new TreeNode(0);
        func(root, head);
        return head.right;
    }
    TreeNode func(TreeNode root, TreeNode head) {
        if (root != null) {
            head = func(root.left, head);
            root.left = null;
            head.right = root;
            head = root;
            head = func(root.right, head);
        }
        return head;
    }
}
