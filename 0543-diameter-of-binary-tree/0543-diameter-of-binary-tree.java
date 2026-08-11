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
    public int diameterOfBinaryTree(TreeNode root) {
        //BFS 
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int diameter = 0;
        while(!q.isEmpty()){
            int size = q.size();
                TreeNode node = q.poll();
                int leftHeight = height(node.left);
                int rightHeight = height(node.right);
                diameter = Math.max(diameter, leftHeight + rightHeight);
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
        }
        return diameter;
    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int height= 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size ;i++){
                TreeNode node = q.poll();
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
            }
            height++; 
        }
        return height;
    }
}