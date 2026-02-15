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
        if(head==null) return head;
        if(k==0) return head;
        int len=1;
        ListNode curr=head;
        ListNode prevhead=head;
        while(curr.next!=null){
            len++;
            curr=curr.next;
        }
        int swaps=k%len;
        if(swaps==0) return head;
        swaps=len-swaps;
        ListNode prev=null;
        curr=head;
        while(swaps>0 && curr.next!=null){
            prev=curr;
            curr=curr.next;
            swaps--;
        }
        prev.next=null;
        head=curr;
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=prevhead;
        return head;
    }
}  