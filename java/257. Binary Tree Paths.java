// https://leetcode-cn.com/problems/binary-tree-paths/submissions/
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
    public List<String> binaryTreePaths(TreeNode root) {
        return dps(root,null,null);
    }
    List<String> dps(TreeNode root, String string, List<String> res) {
        if (res == null) res = new ArrayList();
        if (string == null) string = "";
        StringBuilder str = new StringBuilder(string);
        if (root == null) return res;
        str.append(String.valueOf(root.val));
        if (root.left == null && root.right == null) {
            res.add(str.toString());
        } else {
            str.append("->");
            dps(root.left, str.toString(), res);
            dps(root.right, str.toString(), res);
        }
        return res;
    }
}
