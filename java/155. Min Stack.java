// https://leetcode-cn.com/problems/min-stack/submissions/
class MinStack {
    Deque<Integer> s;
    Deque<Integer> min;
    /** initialize your data structure here. */
    public MinStack() {
        s = new LinkedList<Integer>();
        min = new LinkedList<Integer>();
        min.push(Integer.MAX_VALUE);
    }
    
    public void push(int x) {
        s.push(x);
        min.push(Math.min(min.peek(),x));
    }
    
    public void pop() {
        s.pop();
        min.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
