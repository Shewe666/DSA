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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if( p == null && q == null ){
            return true;
        }
        if(p == null || q == null){ //this means one exists and other does not exists..
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        boolean left = isSameTree(p.left , q.left);
        boolean right= isSameTree(p.right, q.right);

        return left && right ; // if both are true only then same tree otherwise not ..
        
    }
}