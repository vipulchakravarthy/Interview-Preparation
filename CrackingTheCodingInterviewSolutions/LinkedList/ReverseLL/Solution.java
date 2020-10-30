import java.util.*;

class Solution{
	public Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
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