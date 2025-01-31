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
    public ListNode oddEvenList(ListNode head) {
        ListNode even = new ListNode(0);
        ListNode ev = even;
        ListNode odd = new ListNode(0);
        ListNode od = odd;
        int idx = 1;
        while(head != null){
            if(idx % 2 == 0){ // odd even linked List
                ev.next = head;
                ev = ev.next;
            }else{
                od.next = head;
                od = od.next;
            }
            head = head.next;
            idx++;
        }
        ev.next = null;
        od.next = even.next;
        return odd.next;
    }
}