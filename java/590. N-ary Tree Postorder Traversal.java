// https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/submissions/
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        LinkedList<Integer> res = new LinkedList();
        if (root == null) return res;
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        while(!stack.isEmpty()) {
            Node n = stack.pop();
            res.addFirst(n.val);
            for(Node child: n.children) {
                if (child != null)
                    stack.push(child);
            }
        }
        return res;
    }
}
