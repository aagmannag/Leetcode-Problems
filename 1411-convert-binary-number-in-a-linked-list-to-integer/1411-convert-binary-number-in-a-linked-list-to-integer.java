class Solution {
    public int getDecimalValue(ListNode head) {
        int decimalValue = 0;
        ListNode current = head;
        
        while (current != null) {
            decimalValue = decimalValue * 2 + current.val;
            current = current.next;
        }
        
        return decimalValue;
    }
}
