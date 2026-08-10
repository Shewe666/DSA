/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if( root == null){
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean flag = true;
        while(!q.isEmpty()){
            LinkedList<Integer>li = new LinkedList<>();
            int size = q.size();
        for(int i=0 ;i<size;i++){
            TreeNode node = q.poll();
            if(flag){
                li.addLast(node.val);
            }
            else{
                li.addFirst(node.val); //this is for the reversal when the index is odd
            }
            //adding children elements to the queue
            if(node.left!=null){
                q.add(node.left);
            }
            if( node.right!= null){
                q.add(node.right);
            }

        }
        ans.add(li);
        flag=!flag;
        }
        return ans;
    }
}