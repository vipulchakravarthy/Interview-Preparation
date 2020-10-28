import java.util.*;

class Solution{
	int KthToLast(LinkedList list, int k){
		Node temp = list.head;
		int length = 0;
		while(temp != null){
			length++;
			temp = temp.next;
		}

		temp = list.head;
		int i = 0;
		while(temp != null){
			if(i == length-k){
				return temp.data;
			}
			temp = temp.next;
			i++;
		}
		return list.head.data;
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