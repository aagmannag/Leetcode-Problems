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
        ListNode dummy = new ListNode(0);
        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode temp = dummy;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                ListNode a = new ListNode(l1.val);
                temp.next = a;
                temp = a;
                l1 = l1.next;
            }else{
                ListNode a = new ListNode(l2.val);
                temp.next = a;
                temp = a;
                l2 = l2.next;
            }
        }
        if(l1 == null){
            temp.next = l2;
        }else{
            temp.next = l1;
        }
        return dummy.next;
    }
}