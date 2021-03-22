// https://leetcode-cn.com/problems/increasing-order-search-tree/
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
    List<TreeNode> res = null;
    public TreeNode increasingBST(TreeNode root) {
        res = new ArrayList();
        func(root);
        return func2();
    }
    void func(TreeNode root) {
        if(root != null) {
            func(root.left);
            res.add(root);
            func(root.right);
        }
    }
    TreeNode func2() {
        if (res == null || res.size() <= 0) return null;
        TreeNode head = res.get(0);
        TreeNode p = head;
        for(int i = 1;i < res.size(); i++) {
            TreeNode node = res.get(i);
            node.left = null;
            node.right = null;
            p.left = null;
            p.right = node;
            p = node;
        }
        return head;
    }
}
