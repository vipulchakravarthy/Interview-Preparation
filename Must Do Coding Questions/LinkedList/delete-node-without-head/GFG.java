class GfG
{
    void deleteNode(Node node)
    {
         // Your code here
         if(node.next == null) return;
         
         node.data = node.next.data;
         node.next = node.next.next;
    }
}