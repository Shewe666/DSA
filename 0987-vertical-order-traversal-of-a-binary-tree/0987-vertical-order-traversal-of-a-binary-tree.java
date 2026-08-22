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
    List<int []> list = new ArrayList<>();
    public List<List<Integer>> verticalTraversal(TreeNode root) {
     dfs(root,0,0);
     Collections.sort(list,(a,b)->{
        //sorting on basis on vertices/columns
        if(a[0]!=b[0]){
            return a[0]-b[0];
        }
        //if columns are equal than sorting on the basis of rows/levels..
        else if(a[1]!=b[1]){
            return a[1]-b[1];
        }
        //if both vertices and columns are equal sort on the basis of value 
        else{
            return a[2]-b[2];
        }
     });

     List<List<Integer>> ans = new ArrayList<>();
     int prevIdx=Integer.MIN_VALUE;
     for( int []node:list){
        if(node[0]!=prevIdx){
            ans.add(new ArrayList<>());
            prevIdx=node[0];
        }
        ans.get(ans.size()-1).add(node[2]);
     }
     return ans ;
    }
    public void dfs( TreeNode root,int row, int col){
        //base condition or stoping condition of the recursive call .. 
        if( root ==null){
            return;
        }
        list.add(new int[]{col,row,root.val});
        dfs(root.left,row+1,col-1);
        dfs( root.right , row+1, col+1);
    }
   
}