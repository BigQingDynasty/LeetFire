// https://leetcode-cn.com/problems/two-sum-iv-input-is-a-bst/
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
    HashSet<Integer> set;
    public boolean findTarget(TreeNode root, int k) {
        set = new HashSet();
        return func(root, k);
    }
    boolean func(TreeNode root, int k) {
        if (root == null) return false;
        if (set.contains(root.val)) 
            return true;
        else
            set.add((Integer)(k - root.val));
        return func(root.left, k) || func(root.right, k);
    }
    
}
