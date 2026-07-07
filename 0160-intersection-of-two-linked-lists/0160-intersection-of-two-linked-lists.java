/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int m = length(headA);
        int n = length(headB);
        int diff = Math.abs(m - n);
        ListNode tempA = headA;
        ListNode tempB = headB;
        if (m > n) {
            while (diff != 0) {
                tempA = tempA.next;
                diff--;
            }
        } else {
            while (diff != 0) {
                tempB = tempB.next;
                diff--;
            }
        }
        while (tempA != null && tempB != null) {
            if (tempA == tempB) {
                return tempA;
            } 
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return null;

    }

    public int length(ListNode head) {
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            length++;
        }
        return length;
    }
}