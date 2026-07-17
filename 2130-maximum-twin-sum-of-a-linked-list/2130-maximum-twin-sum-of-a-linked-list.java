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
    public int pairSum(ListNode head) {
        //self -brute force O(3n/2) TC And O(n) space complexity
        List<Integer> l=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            l.add(temp.val);
            temp=temp.next;
        }
        int sum=0;
        int maxSum=0;
        for(int i=0;i<l.size()-1;i++){
            sum=l.get(i)+l.get(l.size()-i-1);
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;

    }
}