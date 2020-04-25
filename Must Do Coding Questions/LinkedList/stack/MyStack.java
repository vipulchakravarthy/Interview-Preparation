/*
The structure of the node of the stack is
class StackNode
{
    int data;
    StackNode next;
    StackNode(int a)
    {
       data = a;
       next = null;
    }
}
*/
class MyStack {
    // Note that top is by default null
    // in Java
    StackNode top;
    void push(int a) {
        // Add your code here
        StackNode obj = new StackNode(a);
        if(top == null){
            top = obj;
            return;
        }
    
        obj.next = top;
        top  = obj;
    }
    int pop() {
        // Add your code here
        
        int res = -1;
        if(top == null) {
            return res;
        }
        
        res = top.data;
        top = top.next;
        return res;
        
    }
}
