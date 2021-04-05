// https://leetcode-cn.com/problems/minimum-distance-between-bst-nodes/submissions/
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
    int res  = 2147453647;
    TreeNode pre = null;
    public int minDiffInBST(TreeNode root) {
        res = 2147453647;
        pre = null;
        func(root);
        return res;
    }
    void func(TreeNode root) {
        if (root != null) {
            func(root.left);
            if (pre == null) {
                pre = root;
            } else {
                res = Math.min(res, Math.abs(pre.val - root.val));
                pre = root;
            }
            func(root.right);
        }
    }

}
