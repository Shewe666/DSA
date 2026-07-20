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
   //optimized approach:
   if(head==null && head.next==null){
    return;
   }
   ListNode slow=head;
   ListNode fast=head;
   //first middle condition inside thw hile loop
   while(fast.next!=null && fast.next.next!=null ){
    slow=slow.next;
    fast=fast.next.next;
   }
   //reverse second half  logic 
   ListNode second=slow.next;
   slow.next=null;
   ListNode prev=null;
   ListNode curr=second;

   while(curr!=null){
   ListNode next=curr.next;
   curr.next=prev;
   prev=curr;
   curr=next;
   }

   ListNode first=head;
   second=prev;
   //in half linked list reversal we will do second!=null cpz second half will be null first
   while(second!=null){
    ListNode next1=first.next;
    ListNode next2=second.next;
    first.next=second;
    second.next=next1;

    first=next1;
    second=next2;
   }
    }
}