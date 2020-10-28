class Node{
		int data;
		Node next;

		Node(int d){
			this.data = d;
			this.next = null;
		}

		public String toString(){
			return this.data+" ";
		}
}

class LinkedList{
	Node head;
	LinkedList(){
		this.head = null;
	}

	void addElement(int ele){
		Node newNode = new Node(ele);
		if(this.head == null){ 
			this.head = newNode;
			return;
		}
		Node temp = this.head;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = newNode;
	}

	public String toString(){
		Node temp = this.head;
		String res = "";
		while(temp != null){
			res += temp;
			temp = temp.next;
		}
		return res;
	}
}