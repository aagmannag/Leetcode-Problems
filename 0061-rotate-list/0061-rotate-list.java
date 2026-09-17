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
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int n = 0;
        ListNode tail = head;

        while (tail != null) {
            tail = tail.next;
            n++;
        }

        k = k % n;

        if (k == 0) {
            return head;
        }

        tail = head;

        while (tail.next != null) {
            tail = tail.next;
        }

        tail.next = head; // make circle

        for (int i = 0; i < n - k; i++) {
            tail = tail.next;
        }

        ListNode ans = tail.next; // new head
        tail.next = null;         // break circle

        return ans;
    }
}