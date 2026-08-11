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
    public boolean isBalanced(TreeNode root) {
        //bfs o(n2) time complexity
        if( root == null){
            return true;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);
             
            if (Math.abs(leftHeight-rightHeight)>1){
                return false;
            }
            if(node.left!= null){
                q.offer(node.left);
            }
            if(node.right!= null){
                q.offer(node.right);
            }
        }
        return true;
    }
    private int height(TreeNode root){
        if(root == null){
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int height=0;
        while(!q.isEmpty()){
        int size = q.size();
        for( int i =0;i< size;i++){
            TreeNode node = q.poll();
            if(node.left!= null){
                q.offer(node.left);
            }
            if(node.right!= null){
                q.offer(node.right);
         }
        }
        height ++;  
     }
     return height;
    }
}