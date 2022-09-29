/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) 
    {
//         if(head == null || head.next != null)
//         {
//             return null;
//         }
//         ListNode hare = head;
//         ListNode turtle = head;
    
//         while(hare != null && hare.next != null)
//         {
//             hare = hare.next.next;
//             turtle = turtle.next;
            
//             if(hare == turtle)
//             {
//                 while (head != hare) {
//                 hare = hare.next;
//                 head = head.next;
//             }
//             return head;
//             }
//         }
//         return null;
        
        if (head == null || head.next == null) {
        return null;   // no circle
    }
    ListNode slow = head, fast = head;
    while (fast != null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;
        if (fast == slow) {  // circle detected
            while (head != fast) {
                fast = fast.next;
                head = head.next;
            }
            return head;
        }
    }
    return null;
    }
       
}