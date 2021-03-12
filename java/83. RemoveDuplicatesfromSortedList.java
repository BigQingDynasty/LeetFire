// https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/submissions/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode res = head;
        ListNode next = null;
        while( head != null) {
            next = head.next;
            while(next != null && next.val == head.val) next = next.next;
            head.next = next;
            head = next;
        }
        return res;
    }
}
