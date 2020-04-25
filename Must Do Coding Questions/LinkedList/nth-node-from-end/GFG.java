class GfG
{
	//using count
    int getNthFromLast(Node head, int n)
    {
	// Your code here
	    if(head == null){
	        return -1;
	    }
	    int count = 1;
	    Node temp = head;
	    while(temp.next != null){
	        temp = temp.next;
	        count++;
	    }
	    int res = count-n;
	   // System.out.println("count:" + count);
	   // System.out.println("res:" + res);
	    if(n > count) {
	        return -1;
	    }
	    temp = head;
	    int i = 0;
	    while(i < res && temp.next != null){
            temp = temp.next;
            i++;
	    }
	    return temp.data;
    }
}