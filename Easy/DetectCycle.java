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
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        if(head.next == null){
            return false;
        }
        boolean found = false;
        ListNode slow = head;
        ListNode fast = head.next;
        while(!found && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                found = true;
            }
        }
        
        return found;
    }
}