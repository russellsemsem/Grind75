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

/*
My Solution:
if you come across the same value (in this case, MAX_VALUE), theres a cycle
if you reach null, then there's no cycle

Other solution that doesn't require changing 
the values or using a "flag"/"flagged" method: Floyd's tortoise and hare alg

exp:
public boolean hasCycle(ListNode head) {
  ListNode slow = head, fast = head;
  
  while (fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;
    
    if (slow == fast) 
        return true;
  }
  
  return false;
}

*/

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode curr = head;
        
        while(curr != null && curr.next != null){
            curr.val = Integer.MAX_VALUE;
            if(curr.next.val == curr.val){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
}