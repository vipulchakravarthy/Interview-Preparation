class GfG
{

  //using a extra data structure
 int detectLoop(Node head)
  {
   // Add code here
   ArrayList<Node> list = new ArrayList<>();
   Node temp = head;
   while(temp.next != null) {
       if(list.contains(temp)){
           return 1;
       }
       list.add(temp);
       temp = temp.next;
   }
   return 0;
  }

  //using two pointers
  //slow and fast
  int detectLoop2(Node head) 
    { 
        Node slow_p = head, fast_p = head; 
        while (slow_p != null && fast_p != null && fast_p.next != null) { 
            slow_p = slow_p.next; 
            fast_p = fast_p.next.next; 
            if (slow_p == fast_p) { 
                System.out.println("Found loop"); 
                return 1; 
            } 
        } 
        return 0; 
    } 
  
}