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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> al = new LinkedList<>();
        if(root==null)
        {
            return al;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        boolean flag = false;
        while(q.isEmpty() == false)
        {
            int count = q.size();
            LinkedList<Integer> sub = new LinkedList<>();
            for(int i=0 ;i<count ;i++)
            {
                TreeNode cur= q.poll();
                if(flag)
                {
                    sub.addFirst(cur.val);
                }
                else{
                    sub.addLast(cur.val);
                }
                if(cur.left!=null)
                    q.add(cur.left);
                if(cur.right!=null)
                    q.add(cur.right);
            }
            flag = !flag;
            al.add(sub);
        }
        return al;
    }
}