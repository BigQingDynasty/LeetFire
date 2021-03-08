// https://leetcode-cn.com/problems/implement-queue-using-stacks/
class MyQueue {
    Stack<Integer> a, b;
    /** Initialize your data structure here. */
    public MyQueue() {
        a = new Stack<Integer>();
        b = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        b.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (!a.isEmpty()) {
            return a.pop();
        }
        while (!b.isEmpty()) {
            Integer x =(Integer) b.pop();
            a.push(x);
        }
        return (int) a.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        if (!a.isEmpty()) {
            return a.peek();
        }
        while (!b.isEmpty()) {
            Integer x = b.pop();
            a.push(x);
        }
        return a.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return a.isEmpty() && b.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
