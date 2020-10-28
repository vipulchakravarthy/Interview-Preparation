import java.util.*;

class Solution{
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dumy = new ListNode(0);
        dumy.next = head;
        ListNode first = dumy;
        ListNode second = dumy;
        
        for(int i = 1; i <= n+1; i++){
            first = first.next;
        }
        
        while(first != null){
            first = first.next;
            second = second.next;
        }
        
        second.next = second.next.next;
        return dumy.next;
    }

	public static void main(String[] args) {
		int[] arr = {1,3,5,6,8};
		LinkedList list = new LinkedList();
		for(int i = 0; i < arr.length; i++){
			list.addElement(arr[i]);
		}
		Solution obj = new Solution();
		System.out.println(obj.KthToLast(list, 5));
	}
}