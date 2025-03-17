package queue;

public class DemoQueuesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QueueUsingArrays q = new QueueUsingArrays();
		
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		
		System.out.println(q.dequeue());
	}

}
