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
    public ListNode sortList(ListNode head) {
        java.util.ArrayList<Integer> list=new java.util.ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            list.add(curr.val);
            curr=curr.next;
        }
        java.util.Collections.sort(list);
        curr=head;
        int i=0;
        while(curr!=null){
            curr.val=list.get(i++);
            curr=curr.next;
        }
    return head;
    }
}