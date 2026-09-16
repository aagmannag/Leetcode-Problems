/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode slowA = headA;
        ListNode slowB = headB;
        while(slowA != slowB){
            slowA = (slowA == null) ? headB : slowA.next;
            slowB = (slowB == null) ? headA : slowB.next;
        }
        return slowA;
    }
}