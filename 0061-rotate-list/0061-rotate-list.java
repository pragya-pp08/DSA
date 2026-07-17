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
    public ListNode rotateRight(ListNode head, int k) {
       if(head==null|| head.next==null){
        return head;
       }
       int len=length(head);
       k=k%len;
       if(k==0){
        return head;
       }
       
       ListNode tail=head;
       ListNode newtail=head;
       while(tail.next!=null){
        tail=tail.next;
       }
       for(int i=1;i<len-k;i++){
        newtail=newtail.next;
       } 
       tail.next=head;
       ListNode newhead=newtail.next;
       newtail.next=null;
       return newhead;


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