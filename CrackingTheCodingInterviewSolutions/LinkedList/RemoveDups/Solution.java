import java.util.*;


class Solution{

	void removeDups(LinkedList list){
		Node temp = list.head;
		LinkedList newList = new LinkedList();
		HashSet<Integer> set = new HashSet<>();
		while(temp != null){
			if(!set.contains(temp.data)){
				newList.addElement(temp.data);
				set.add(temp.data);
				// System.out.println(temp.data);
			}
			temp = temp.next;
		}
		list.head = newList.head;
	}

	void deleteDups(Node node){
		Node previous = null;
		HashSet<Integer> set = new HashSet<>();
		while(node != null){
			if(set.contains(node.data)){
				previous.next = node.next;
			}else{
				previous = node;
				set.add(node.data);
			}
			node = node.next;
		}
	}

	public static void main(String[] args) {
		int[] arr = {1,2,4,3};
		LinkedList list = new LinkedList();
		for(int i = 0; i < arr.length; i++){
			list.addElement(arr[i]);
		}
		Solution obj = new Solution();
		// obj.removeDups(list);
		obj.deleteDups(list.head);
		System.out.println(list.toString());
	}
}