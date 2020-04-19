
/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}
This is method only submission.  You only need to complete the method. */
class Solution
{
    // Function to find middle element a linked list
    int getMiddle(Node head)
   {
         // Your code here.
         if(head == null) {
             return -1;
         }
         Node temp = head;
         int count = 1;
         while(temp.next != null) {
             temp = temp.next;
             count++;
         }
         int i = 0;
         temp = head;
        //  System.out.println(count +"hey ");
         while(i < count/2 && temp.next != null){
             temp = temp.next;
             i++;
         }
         return temp.data;
   }
}