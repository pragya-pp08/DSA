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
    public void reorderList(ListNode head) {
       if(head==null || head.next==null){
        return;
       } 
      
       ListNode slow=head;
       ListNode fast=head;
       while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;

       }
       
       ListNode second=slow.next;
       ListNode reversehead=second;
       
       slow.next=null;
       ListNode first=head;
       ListNode prev=null;
       while(second!=null){
       ListNode nex=second.next;
       second.next=prev;
       prev=second;
       second=nex;
       }
       reversehead=prev;
     while (first != null && reversehead != null) {

    ListNode node1 = first.next;
    ListNode node2 = reversehead.next;

    first.next = reversehead;
    reversehead.next = node1;

    first = node1;
    reversehead = node2;
}
       return ;
    }
}