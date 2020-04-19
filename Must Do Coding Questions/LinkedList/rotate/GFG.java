class GFG {
    
     /*  This function should rotate list counter-
    clockwise by k and return new head (if changed) */
    public Node rotate(Node head, int k) {
        // add code here.
        int count = 1;
        Node temp = head;
        while(count < k && temp != null){
            temp = temp.next;
            count++;
        }
        
        if(temp == null){
            return null;
        }
        
        Node kthNode = temp;
        
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
        head = kthNode.next;
        kthNode.next = null;
        
        return head;
    }
}