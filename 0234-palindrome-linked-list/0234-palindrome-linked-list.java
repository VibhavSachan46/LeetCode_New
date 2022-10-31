/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode cur = head;
        int l=0;
        while(cur != null)
        {
            l++;
            list.add(cur.val);
            cur = cur.next;
        }
        for(int i=0;i<l/2;i++)
        {
            if(list.get(i) != list.get(l-i-1))
            {
                return false;
            }
        }
        return true;
        
    }
}