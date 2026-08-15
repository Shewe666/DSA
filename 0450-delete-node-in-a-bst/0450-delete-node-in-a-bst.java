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
    public TreeNode deleteNode(TreeNode root, int key) {
        //first search
        if( root == null){
            return null;
        }
        if(root.val<key){
            root.right = deleteNode(root.right, key);
        }else if(root.val>key){
            root.left = deleteNode(root.left, key);
        }
        else{
        //case 1: when there are zero childs
        if(root.left== null && root.right == null){
            return null; // return null to the parent node so the root node will automatically deleted with the garbage collector .
        }
        //case 2: One child
        if(root.left == null){
            return root.right;
        }
        else if( root.right == null){
            return root.left;
        }

        //case 3: 2 childs 
        TreeNode inorderSuc=successor(root.right);
        root.val=inorderSuc.val;
        root.right = deleteNode(root.right, inorderSuc.val);
        }
        return root;
    }
        

    public TreeNode successor(TreeNode root){
        while(root.left!=null){
            root= root.left;
        }
        return root;
    }
}