// https://leetcode-cn.com/problems/linked-list-cycle/submissions/
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        if (head.next == null) return false;
        ListNode a = head;
        ListNode b = head;
        while ( a != null && b != null) {
            a = a.next;
            if (a == null) return false;
            a = a.next;
            b = b.next;
            if (a == null || b == null) return false;
            if (a == b) return true;
        }
        return false;
    }
}
