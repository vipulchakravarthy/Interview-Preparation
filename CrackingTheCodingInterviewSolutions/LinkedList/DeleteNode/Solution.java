class Solution{
	void deleteNode(Node node){
		node.val = node.next.val;
        node.next = node.next.next;
	}

	// public static void main(String[] args) {
	// 	Solution obj = new Solution();
	// 	obj.deleteNode(node);
	// }
}