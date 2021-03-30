// https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof/
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
    public List<List<Integer>> levelOrder(TreeNode root) {
            if (root == null) return null;
            List<List<Integer>> res = new ArrayList();
            LinkedList<TreeNode> stack = new LinkedList();
            stack.offer(root);
            while(!stack.isEmpty()) {
                List<Integer> list = new ArrayList();
                int size = stack.size();
                for (int i = 0;i < size;i++) {
                    TreeNode t = stack.poll();
                    list.add(t.val);
                    if (t.left != null)
                        stack.offer(t.left);
                    if (t.right != null)
                        stack.offer(t.right);
                }
                res.add(list);
            }
            return res;
    }
}
