/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) 
    {
        ListNode p = node;
        ListNode cur = node.next;
        ListNode Next = node.next.next;
        
        p.val = cur.val;
        p.next = cur.next;
    }
}