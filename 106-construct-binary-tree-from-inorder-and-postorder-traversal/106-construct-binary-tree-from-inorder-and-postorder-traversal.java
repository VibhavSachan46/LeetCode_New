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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<inorder.length ;i++)
        {
            map.put(inorder[i] ,i);
        }
        
        TreeNode ans = solve(inorder , 0 , inorder.length-1, postorder,0,postorder.length-1 , map );
        return ans;
    }
    
    public TreeNode solve(int inorder[] , int inStart , int inEnd ,int[] postorder, int pStart ,int pEnd ,                                                                  Map<Integer,Integer> map)
    {
        if(inStart>inEnd || pStart>pEnd)
        {
            return null;
        }
        TreeNode root = new TreeNode(postorder[pEnd]);
        int inroot = map.get(root.val);
        int numsleft = inroot-inStart;
        
        root.left= solve(inorder ,inStart , inroot-1, postorder ,pStart ,pStart+numsleft-1, map);
        root.right = solve( inorder ,inroot+1, inEnd, postorder , pStart+numsleft, pEnd-1,  map);

        return root;
    }
}