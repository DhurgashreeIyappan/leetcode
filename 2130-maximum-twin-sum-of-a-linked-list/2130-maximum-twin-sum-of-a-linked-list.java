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
    public static ListNode middle(ListNode head){
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int m=count/2;
        temp=head;
        while(m>0){
            temp=temp.next;
            m--;
        }
        return temp;
    }
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        ListNode mid= middle(head);
        ListNode rev= reverse(mid);
        ListNode temp=head;
        int twin=0;
        while(temp!=null && rev!=null){
            int sum=temp.val+rev.val;
            if(sum>twin) twin= sum;
            temp=temp.next;
            rev=rev.next;
        }
        return twin;
    }
}