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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        ListNode slow = list1;
        ListNode fast = list2;

        while(slow != null && fast != null){
            if(slow.val < fast.val){
                ListNode a = new ListNode(slow.val);
                temp.next = a;
                temp = a;
                slow = slow.next;
            }else{
                ListNode b = new ListNode(fast.val);
                temp.next = b;
                temp = b;
                fast = fast.next;
            }
        }
        if(slow == null){
            temp.next = fast;
        }else{
            temp.next = slow;
        }
        return dummy.next;
    }
}