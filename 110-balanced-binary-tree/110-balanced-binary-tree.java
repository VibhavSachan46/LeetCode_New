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
    public boolean result = true;
    
    public boolean isBalanced(TreeNode root) {
        helper(root);
        return result;
    }
    
    int helper(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int lh = helper(root.left);
        if(lh==-1)
        {
            return 0;
        }
        int rh =helper(root.right);
        if(rh==-1)
        {
            return 0;
        }
        if(Math.abs(lh-rh)>1)
        {
            result=false;
        }
        return Math.max(lh,rh)+1;
    }
}