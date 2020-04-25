//User function Template for Java
/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class LinkedList
{
    static Node segregate(Node head)
    {
        // add your code here
        if(head == null) {
            return head;
        }
        Node temp = head;
        int[] count = new int[3];
        while(temp != null) {
            count[temp.data]++;
            temp = temp.next;
        }
        
        temp = head;
        int i = 0;
        while(temp != null) {
            while(count[i] != 0) {
                temp.data = i;
                count[i]--;
                temp = temp.next;
            }
            i++;
        }
        
        return head;
    }
    
}
