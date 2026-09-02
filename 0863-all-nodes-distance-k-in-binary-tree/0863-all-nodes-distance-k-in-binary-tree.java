/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    HashMap<TreeNode,TreeNode> parent = new HashMap<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        buildParent(root,null);
        Queue<TreeNode> q = new LinkedList<>();
        HashSet<TreeNode> visited = new HashSet<>();

        q.offer(target);
        visited.add(target);

        int distance =0;
        while(!q.isEmpty()){
            if(distance == k) break;
            int size = q.size();
            for(int i =0; i <size ;i++){
                TreeNode curr = q.poll();
                if(curr.left!=null && visited.add(curr.left)){
                    q.offer(curr.left);
                }
                if(curr.right!=null && visited.add(curr.right)){
                    q.offer(curr.right);
                }
                //adding the parent 
                if(parent.get(curr)!=null && visited.add(parent.get(curr))){
                    q.offer(parent.get(curr));
                }
            }
           distance++;
        }
        List<Integer> ans = new ArrayList<>();

        while(!q.isEmpty()){
            ans.add(q.poll().val);
        }
        return ans;
    }
    public void buildParent(TreeNode root, TreeNode par){
        if( root ==null){
            return;
        }
        parent.put(root,par);
        buildParent(root.left, root);
        buildParent(root.right,root);
    }
}