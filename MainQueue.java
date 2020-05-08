
import java.io.*;


public class MainQueue{
	public static void main(String args[])throws Exception {
		MyQueue<Integer> queue = new MyQueue();
		MyLinkedList1<Integer> ml = new  MyLinkedList1();
		queue.enqueue(12);
		queue.enqueue(13);
		queue.enqueue(13);
		queue.enqueue(13);
		queue.enqueue(13);
		queue.enqueue(14);
		System.out.println("Peeked" + queue.poll());
		queue.dequeue();
		ml.print();
	}
}
