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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<inorder.length ;i++)
        {
            map.put(inorder[i] ,i);
        }
        
        TreeNode ans = solve(preorder ,0, preorder.length-1 ,inorder , 0 , inorder.length-1 , map );
        return ans;
    }
    
    public TreeNode solve(int preorder[] , int preStart ,int preEnd ,int inorder[],int inStart , int                                inEnd , Map<Integer,Integer> map)
    {
        if(inStart>inEnd || preStart>preEnd)
        {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int inroot = map.get(root.val);
        int numsleft = inroot-inStart;
        
        root.left= solve(preorder , preStart+1, preStart+numsleft, inorder ,inStart ,inroot-1, map);
        root.right = solve(preorder , preStart+numsleft+1, preEnd, inorder ,inroot+1, inEnd, map);
        
        return root;
    }
    
    
}