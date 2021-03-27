// https://leetcode-cn.com/problems/average-of-levels-in-binary-tree/submissions/
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
    public List<Double> averageOfLevels(TreeNode root) {
        if (root == null) return null;
        List<Double> res = new ArrayList();
        LinkedList<TreeNode> que = new LinkedList();
        que.offer(root);
        while(!que.isEmpty()) {
            double sum = 0;
            int i = 0;
            int size = que.size();
            for (; i < size; i++) {
                TreeNode t = que.poll();
                sum += t.val;
                if (t.left != null) que.offer(t.left);
                if (t.right != null) que.offer(t.right);
            }
            res.add(sum / i);
        }
        return res;
    }
}
