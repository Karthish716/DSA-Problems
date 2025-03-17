package queue;

public class QueueUsingArrays {

	static final int MAX_SIZE = 30;
	int arr[];
	int front , rear;
	
	QueueUsingArrays(){
		arr = new int[MAX_SIZE];
		front =-1;
		rear=-1;
		
	}
	public void enqueue(int val) {
		if(rear == MAX_SIZE-1) {
			throw new IndexOutOfBoundsException("Queue is Full ");
		}
			if(front==-1) {
				front++;
			}
		arr[++rear]=val;
		
	}
	public int dequeue() {
		if(front==-1 && front >rear) {
			throw new IndexOutOfBoundsException("Queue is empty");
		}
		return arr[front++];
	}
}
