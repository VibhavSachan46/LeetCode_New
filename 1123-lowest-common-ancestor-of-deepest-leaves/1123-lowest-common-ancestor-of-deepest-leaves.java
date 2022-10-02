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
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        if(root==null) return null;
        int lh=dfs(root.left);
        int rh=dfs(root.right);
        if(lh==rh) return root;
        if(lh>rh) return lcaDeepestLeaves(root.left);
        else return lcaDeepestLeaves(root.right);
        
    }
    
    public int dfs(TreeNode root)
    {
        if(root==null) return -1;
        int lh=dfs(root.left);
        int rh=dfs(root.right);
        return Math.max(lh,rh)+1;
    }
}