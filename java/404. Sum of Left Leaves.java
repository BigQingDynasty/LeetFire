// https://leetcode-cn.com/problems/sum-of-left-leaves/submissions/
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
    public int sumOfLeftLeaves(TreeNode root) {
        return sumFunc(root, false, 0);
    }
    int sumFunc(TreeNode root, boolean isLeft, int sum) {
        if (root == null) return sum;
        if (root.left == null && root.right == null) {
            if (isLeft) return sum + root.val;
            else return sum;
        } else {
            return sum + sumFunc(root.left, true, sum) + sumFunc(root.right, false, sum);
        }
    }
}
