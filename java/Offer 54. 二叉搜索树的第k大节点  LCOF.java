// https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/submissions/
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
    int count = 0, res = -1;
    public int kthLargest(TreeNode root, int k) {
        this.count = 0;
        func(root, k);
        return res;
    }
    void func(TreeNode root, int k) {
        if (root != null && count < k) {
            func(root.right, k);
            if (count == k - 1) {
                count++;
                this.res = root.val;
                return;
            }
            this.count++;
            func(root.left, k);
        }
        return;
    }

}
