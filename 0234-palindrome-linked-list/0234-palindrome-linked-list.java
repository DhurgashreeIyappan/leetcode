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
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        while(head!=null){
            ListNode node = new ListNode(head.val); // COPY node
            node.next = prev;
            prev = node;
            head = head.next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode tmp=head;
        ListNode rev=reverse(head);
        while(tmp!=null){
            if(tmp.val!=rev.val) return false;
            tmp=tmp.next;
            rev=rev.next;
        }
        return true;
    }
}