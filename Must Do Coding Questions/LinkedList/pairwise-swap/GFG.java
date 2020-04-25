class GfG
{
    public static void pairwiseSwap(Node node)
    {
        
       // add your code here
       Node temp = node;
       
       while(temp != null && temp.next != null){
           int d = temp.data;
           temp.data = temp.next.data;
           temp.next.data = d;
           temp = temp.next.next;
       }
    }
    
   
}