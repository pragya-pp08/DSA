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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode temp=head;
       int l=length(head);
       if(l==n){
        return temp.next;
       }
       else{
         for(int i=1;i<l-n;i++){
            temp=temp.next;
         }
         temp.next=temp.next.next;
       }
       return head;


    }
    public int length(ListNode head){
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        return len;
    }
}