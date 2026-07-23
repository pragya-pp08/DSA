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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            prev = prev.next;
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondhead = slow;
        prev.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(secondhead);
        return merge(left, right);
    }

    public ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (left != null && right != null) {
            if (left.val <= right.val) {
                prev.next = left;
                prev = prev.next;
                left = left.next;
            } else {
                prev.next = right;
                prev = prev.next;
                right = right.next;
            }
        }
        while (left != null) {
            prev.next = left;
            prev = prev.next;
            left = left.next;
        }
        while (right != null) {
            prev.next = right;
            prev = prev.next;
            right = right.next;
        }
        return dummy.next;

    }
}