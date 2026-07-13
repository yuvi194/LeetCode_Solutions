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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode prevGroup = head;
        ListNode curr = head.next;
        int len = 2;
        while (curr != null) {
            int actualLength = 0;
            ListNode walker = curr;
            while (actualLength < len && walker != null) {
                actualLength++;
                walker = walker.next;
            }
            if (actualLength % 2 == 0) {
                ListNode prev = walker, node = curr;
                for (int i = 0; i < actualLength; i++) {
                    ListNode next = node.next;
                    node.next = prev;
                    prev = node;
                    node = next;
                }
                ListNode nextGroup = prevGroup.next;
                prevGroup.next = prev;
                prevGroup = nextGroup;
            } else {
                for (int i = 0; i < actualLength; i++) {
                    prevGroup = prevGroup.next;
                }
            }
            curr = prevGroup.next;
            len++;
        }
        return head;
    }
}