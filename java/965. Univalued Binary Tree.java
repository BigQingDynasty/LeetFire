// https://leetcode-cn.com/problems/univalued-binary-tree/submissions/
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
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) return false;
        return dfs(root, root.val);
    }
    boolean dfs(TreeNode root, int val) {
        if (root != null) {
            if (root.val == val) {
                return dfs(root.left, val) && dfs(root.right, val);
            } else
            return false;
        }
        return true;
    }
}
