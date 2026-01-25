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
    public ListNode reverse(ListNode curr,ListNode prev){
        ListNode pre=prev;
        while(curr!=prev){
            ListNode temp=curr.next;
            curr.next=pre;
            pre=curr;
            curr=temp;
        }
        return pre;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null) return null;
        int l=0;
        ListNode start=head;
        while(start!=null){
            l++;
            start=start.next;
        }
        if(k>l) return head;
        start=head;
        int groups=l/k;
        start=head;
        ListNode dhead=null;
        ListNode prevTail = null;
        ListNode prev; 
        while(groups>0){
            prev=start;
            int n=k;
            while(n>0){
                prev=prev.next;
                n--;
            }
            ListNode newHead = reverse(start, prev);
            if(dhead == null){
                dhead = newHead;
            }
            if(prevTail != null){
                prevTail.next = newHead;
            }

            prevTail = start;
            start = prev;
            groups--;
        }
        return dhead;
    }
}