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
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                ListNode a = new ListNode (list1.val);
                temp.next = a;
                temp = a;
                list1 = list1.next;
            }else{
                ListNode b = new ListNode(list2.val);
                temp.next = b;
                temp = b;
                list2 = list2.next;
            }
        }
        if(list1 == null){
            temp.next = list2;
        }
        if(list2 == null){
            temp.next = list1;
        }
        return dummy.next;
    }
}