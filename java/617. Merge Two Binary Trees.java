// https://leetcode-cn.com/problems/merge-two-binary-trees/submissions/
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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return gen(root1, root2, null);
    }
    TreeNode gen(TreeNode root1, TreeNode root2, TreeNode root3) {
        if (root1 != null && root2 != null) {
            root3 = new TreeNode(root1.val + root2.val);
            root3.left = gen(root1.left, root2.left, null);
            root3.right = gen(root1.right, root2.right, null);
        } else if (root1 != null) {
            root3 = new TreeNode(root1.val);
            root3.left = gen(root1.left, null, null);
            root3.right = gen(root1.right, null, null);
        } else if (root2 != null) {
            root3 = new TreeNode(root2.val);
            root3.left = gen(null, root2.left, null);
            root3.right = gen(null, root2.right, null);
        } else{
            root3 = null;
        }
        return root3;
    }
}
