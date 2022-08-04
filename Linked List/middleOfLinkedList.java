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

 /*
    Another solution: 
    most likely will be asked to solve without an arraylist or any array, if that's the case then use 
    floyd's tortoise and hare alg

    class Solution {
    public ListNode middleNode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;

            while(fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    }

    fast pointer will go twice as fast as the slow pointer, thus once the fast goes through entire linked list,
    the slow will only be halfway, thus return slow.

 */

class Solution {
    public ListNode middleNode(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<ListNode>();
        
        ListNode curr = head;
        while(curr != null){
            list.add(curr);
            curr = curr.next;
        }
        return list.get(list.size() / 2);
    }
}