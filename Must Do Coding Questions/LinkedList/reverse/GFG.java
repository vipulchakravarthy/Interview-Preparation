 class Node {
     int value;
    Node next;
    Node(int value) {
        this.value = value;
    }
} */
class GFG
{
    // This function should reverse linked list and return
   // head of the modified linked list.
   Node reverseList(Node head)
   {
        // add code here
        if(head == null) return head;
        
        Node prev = null;
        Node curr = head;
        Node after = null;
        while(curr != null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
   }
}
