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
    public ListNode partition(ListNode head, int x) {
       

        ListNode lessDummy = new ListNode(-1);
        ListNode greaterDummy = new ListNode(-1);

        ListNode less = lessDummy;
        ListNode greater = greaterDummy;

        ListNode temp = head;

        while (temp != null) {

            if (temp.val < x) {
                less.next = temp;
                less = less.next;
            } else {
                greater.next = temp;
                greater = greater.next;
            }

            temp = temp.next;
        }

        // End the greater list
        greater.next = null;

        // Connect both lists
        less.next = greaterDummy.next;

        return lessDummy.next;
    }
}