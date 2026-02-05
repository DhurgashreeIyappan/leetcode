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
        if(head==null) return head;
        Node curr=head;
        while(curr!=null){
            Node copy=new Node(curr.val);
            copy.next=curr.next;
            curr.next=copy;
            curr=copy.next;
        }
        curr=head;
        while(curr!=null){
            if(curr.random!=null){
                curr.next.random=curr.random.next;
            }
            curr=curr.next.next;
        }
        curr=head;
        Node newhead=curr.next;
        Node copycurr=newhead;
        while(curr!=null){
            curr.next=curr.next.next;
            if(copycurr.next!=null){
                copycurr.next=copycurr.next.next;
            }
            curr=curr.next;
            copycurr=copycurr.next;
        }
        return newhead;
    }
}