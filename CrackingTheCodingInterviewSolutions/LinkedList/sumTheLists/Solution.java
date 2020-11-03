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
//leet code
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newListHead = new ListNode();
        ListNode temp = newListHead;
        int sum = 0;
        int carry = 0;
        while(l1 != null && l2 != null){
            sum = l1.val + l2.val + carry;
            if(sum > 9){
                carry = 1;
                sum = sum-10;
            }else{
                carry = 0;
            }
            temp.next = new ListNode(sum);
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        
        while(l1 != null){
            sum = l1.val + carry;
            if(sum > 9){
                carry = 1;
                sum = sum-10;
            }else{
                carry = 0;
            }
            temp.next = new ListNode(sum);
            temp = temp.next;
            l1 = l1.next;

        }
    
        
        while(l2 != null){
            sum = l2.val + carry;
            if(sum > 9){
                carry = 1;
                sum = sum-10;
            }else{
                carry = 0;
            }
            temp.next = new ListNode(sum);
            temp = temp.next;
            l2 = l2.next;
        }
        
        if(carry > 0){
            temp.next = new ListNode(carry);
            temp = temp.next;
        }
        return newListHead.next;
    }
}