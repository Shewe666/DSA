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

       /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {

        // Step 1: Store linked list values in an ArrayList
        ArrayList<Integer> arr = new ArrayList<>();

        ListNode curr = head;
        while (curr != null) {
            arr.add(curr.val);
            curr = curr.next;
        }

        int n = arr.size();
        int[] ans = new int[n];

        // Step 2: For every element, search to the right
        for (int i = 0; i < n; i++) {

            ans[i] = 0;   // Default answer

            for (int j = i + 1; j < n; j++) {

                if (arr.get(j) > arr.get(i)) {
                    ans[i] = arr.get(j);
                    break;
                }
            }
        }

        return ans;
    }
}

    