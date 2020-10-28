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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return dfs(root, p, q);
    }
    
    public TreeNode dfs(TreeNode root, TreeNode p, TreeNode q){
        if(root.val > p.val && root.val > q.val){
            return dfs(root.left, p, q);
        }
        else if(root.val < p.val && root.val < q.val){
            return dfs(root.right, p, q);
        }
        else{
            return root;
        }                 
    }
}