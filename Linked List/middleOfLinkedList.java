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