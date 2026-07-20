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
        //Brute force approach
        ArrayList<Integer>list=new ArrayList<>();
        if(head.next==null){
            return;
        }
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        ArrayList<Integer> ans= new ArrayList<>();
        int left =0;
        int right=list.size()-1;
        while(left<=right){
            ans.add(list.get(left));
            ans.add(list.get(right));
            left++;
            right--;
        }
        // if (left == right) {
        //     ans.add(list.get(left));
        // }
        temp=head;
        int index=0;
        while(temp!=null){
           temp.val=ans.get(index++);
           temp=temp.next;
        }
    }
}