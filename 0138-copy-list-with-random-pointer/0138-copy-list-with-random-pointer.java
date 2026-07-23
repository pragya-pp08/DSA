/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){
            return head;
        }
        Node dummy=new Node(-1);
        Node tail=dummy;
        HashMap<Node,Node>map=new HashMap<>();
        Node temp=head;
        
        while(temp!=null){
            Node copy=new Node(temp.val);
            tail.next=copy;
            tail=tail.next;
            map.put(temp,copy);
            temp=temp.next;        
        }
        temp=head;
        Node copy=dummy.next;
        while(temp!=null){
            copy.random=map.get(temp.random);
            copy=copy.next;
            temp=temp.next;
        }
        return dummy.next;

    }
}