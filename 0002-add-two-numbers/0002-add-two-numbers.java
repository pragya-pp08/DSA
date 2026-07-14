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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int carry = 0;
        int sum = 0;
        while (temp1 != null || temp2 != null) {
            if (temp1 == null) {
                sum = temp2.val + carry;
            } else if (temp2 == null) {
                sum = temp1.val + carry;
            } else {
                sum = temp1.val + temp2.val + carry;
            }

            int digit = sum % 10;
            dummy.next = new ListNode(digit);
            dummy = dummy.next;
            carry = sum / 10;

            if (temp1 != null) {
                temp1 = temp1.next;
            }

            if (temp2 != null) {
                temp2 = temp2.next;
            }
            if (carry != 0) {
                dummy.next = new ListNode(carry);
            }

        }
        return head.next;
    }
}