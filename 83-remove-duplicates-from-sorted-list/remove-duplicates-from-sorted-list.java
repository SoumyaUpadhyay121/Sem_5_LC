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
    public ListNode deleteDuplicates(ListNode head) {
        // If list is empty or has only one node
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;

        // Traverse the list
        while (current != null && current.next != null) {
            // If duplicate, skip the next node
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                // Move to next node if no duplicate
                current = current.next;
            }
        }

        return head;
    }
}
