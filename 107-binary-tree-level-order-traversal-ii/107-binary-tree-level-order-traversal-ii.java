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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> al = new ArrayList<>();
        if(root==null)
        {
            return al;
        }
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(q.isEmpty() == false)
        {
            int count = q.size();
            List<Integer> sub = new ArrayList<>();
            for(int i=0 ;i<count ;i++)
            {
                TreeNode curr= q.poll();
                sub.add(curr.val);
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
            al.add(0,sub);
        }
        return al;
    }
}