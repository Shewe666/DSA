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

    class Pair{
        TreeNode node;
        int index;
    
    public Pair(TreeNode node, int index){
        this.node = node;
        this.index = index;
    }
    }
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root,0));// root and initial index 0
        int maxWidth=0;
        while(!q.isEmpty()){
            int size = q.size();
            int first = q.peek().index;
            int last = first;
            for( int i = 0 ; i<size ;i++){
                Pair curr = q.poll();
                last=curr.index;
                if(curr.node.left!=null){
                    q.offer(new Pair(curr.node.left, 2*curr.index+1));
                }
                if(curr.node.right!=null){
                    q.offer(new Pair(curr.node.right, 2*curr.index+2));
                }   
            }
            int width = (last - first) +1;
            maxWidth = Math.max(maxWidth, width);
        }
        return maxWidth;
      
    }
}