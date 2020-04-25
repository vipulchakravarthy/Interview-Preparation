/*The structure of the node of the queue is
class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}*/
class MyQueue
{
    QueueNode front, rear;
    
    // This function should add an item at
    // rear
	void push(int a)
	{
        // Your code here
        QueueNode obj = new QueueNode(a);
        if(front == null){
            front = obj;
            rear = obj;
        }else{
            rear.next = obj;
            rear = obj;
        }
	}
	
    // This function should remove front
    // item from queue and should return
    // the removed item.
	int pop()
	{
        // Your code here
        if(front == null){
            return -1;
        }
        int res = front.data;
        front = front.next;
        return res;
	}
}
