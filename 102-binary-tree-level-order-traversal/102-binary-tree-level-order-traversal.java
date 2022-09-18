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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> al= new ArrayList<>();
        if(root == null)
        {
            return al;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        int in=0;
        while(!q.isEmpty())
        {
            int c= q.size();
            List<Integer> sub = new ArrayList<>();
            for(int i=0;i<c;i++)
            {
                TreeNode cur = q.poll();
                sub.add(cur.val);
                if(cur.left != null) q.add(cur.left);
                if(cur.right != null) q.add(cur.right);
            }
            al.add(in++,sub);
            
        }
        return al;
    }
}