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
        //base case check:
        if(head==null || head.next== null){
            return head;
        }
        //first lets calc the length 
        int len=1;//coz initially at head so it counts to 1
        ListNode curr=head;
        while(curr.next!=null){//going till the last element
        curr=curr.next;
        len++;
        }
        k=k%len;
        if(k==0){ //no rotations
            return head;
        }

        curr.next=head;//now it is a circular linked list
        ListNode newCurr=head;
        int jumps=len-k;
        for(int i=1;i<jumps;i++){
            newCurr=newCurr.next;
        }
        ListNode newHead=newCurr.next;
        newCurr.next=null;

        return newHead;
        
    }
}