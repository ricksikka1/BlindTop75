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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(-1);
        PriorityQueue<ListNode> q = new PriorityQueue<>(lists.length, (a,b)-> a.val-b.val);
        
        ListNode head = dummy;
        for(ListNode node : lists){
            if(node != null){
                q.add(node);
            }
        }
        
        while(!q.isEmpty()){
            head.next = q.poll();
            head = head.next;
            
            if(head.next != null){
                q.add(head.next);
            }
        }
        
        return dummy.next;
    }
}