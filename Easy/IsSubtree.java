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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(t == null || s == null) return false;
        
        return check(s, t) ? true : isSubtree(s.left, t) || isSubtree(s.right, t);
        
    }
    
    public boolean check(TreeNode s, TreeNode t){
        if(s == null && t == null) return true;
        if(s == null || t == null) return false;
        if(t.val == s.val){
            return check(s.left, t.left) && check(s.right, t.right);
        }
        return false;
    }
}