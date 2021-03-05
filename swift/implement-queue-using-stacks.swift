// https://leetcode-cn.com/problems/implement-queue-using-stacks/

class MyQueue {
    var stack1: [Int] = []
    var stack2: [Int] = []
    var front = -1

    /** Initialize your data structure here. */
    init() {

    }

    /** Push element x to the back of queue. */
    func push(_ x: Int) {
        if stack1.isEmpty{
            front = x
        }
        stack1.append(x)
    }

    /** Removes the element from in front of queue and returns that element. */
    func pop() -> Int {
        if stack2.isEmpty {
            while !stack1.isEmpty {
                stack2.append(stack1.removeLast())
            }
        }
        return stack2.popLast() ?? -1
    }

    /** Get the front element. */
    func peek() -> Int {
        return stack2.last ?? front
    }

    /** Returns whether the queue is empty. */
    func empty() -> Bool {
        return stack1.isEmpty && stack2.isEmpty
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * let obj = MyQueue()
 * obj.push(x)
 * let ret_2: Int = obj.pop()
 * let ret_3: Int = obj.peek()
 * let ret_4: Bool = obj.empty()
 */
