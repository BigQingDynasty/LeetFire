// https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode res = root;
        while (res != null) {
            if (res.val < p.val && res.val < q.val) {
                res = res.right;
            } else if (res.val > p.val && res.val > q.val) {
                res = res.left;
            } else {
                break;
            }
        }
        return res;
    }
}
