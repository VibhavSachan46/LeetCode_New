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
    int preIndex=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode ans = solve(inorder , preorder , 0 , inorder.length-1);
        return ans;
    }
    
    public TreeNode solve(int inorder[], int preorder[],int inorderStart , int inorderEnd)
    {
        if(inorderStart>inorderEnd)
        {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preIndex++]);
        int position = inorderStart;
        for(int i=inorderStart;i<=inorderEnd;i++)
        {
            if(inorder[i]==root.val){
                position = i;
                break;
            }
        }
        root.left= solve(inorder , preorder , inorderStart , position-1);
        root.right = solve(inorder , preorder , position+1 , inorderEnd);
        
        return root;
    }
    
    
}