

class Solution
{
	public static void removeTheLoop(Node head)
{
    //Your code here
    HashMap<Node, Integer> hm = new HashMap<>();
    Node curr= head;
    hm.put(curr,1);
    while(curr!=null){
        if(hm.containsKey(curr.next)){
            curr.next=null; 
            break;
        }
        curr=curr.next;
        hm.put(curr,1);
    }
}
}