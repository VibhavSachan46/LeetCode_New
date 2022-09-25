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
    public int countNodes(TreeNode root) 
    {
        if(root==null)
        {
            return 0;
        }
        int left = heightLeft(root);
        int right = heightRight(root);
        
        if(left == right)
        {
            return (2<<left)-1;
        }
        
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
    
    public int heightLeft(TreeNode root)
    {
        int h=0;
        while(root.left != null)
        {
            h++;
            root = root.left;
        }
        return h;
    }
    
    public int heightRight(TreeNode root)
    {
        int h=0;
        while(root.right != null)
        {
            h++;
            root = root.right;
        }
        return h;
    }
}