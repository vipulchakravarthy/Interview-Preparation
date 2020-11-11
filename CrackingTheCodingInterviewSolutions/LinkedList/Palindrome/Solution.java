class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        
        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        
        fastPtr = head;
        slowPtr = reverse(slowPtr);
        
        while(slowPtr != null && fastPtr != null){
            if(slowPtr.val != fastPtr.val){
                return false;
            }
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next;
        }
        return true;
    }
    
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode nextP = null;
        
        while(curr != null){
            nextP = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextP;
        }
        
        return prev;
    }
    
}