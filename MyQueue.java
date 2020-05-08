
import java.io.*;


public class MyQueue<E> {
	public static class Node<E> {
		E data;
		Node<E> next;

		public Node(E data) {
			this.data = data;
			this.next = null;
		}
	}
	public  Node<E> head, rear;

	public  MyLinkedList1<E> ll = new MyLinkedList1();

	public void enqueue(E e) {
		Node<E> toAdd = new Node<>(e);
		if (head == null) {
			head = rear = toAdd;
			return;
		}
		rear.next = toAdd;
		rear = rear.next;
	}
	public E dequeue()throws Exception {
		if (head == null)
			return null;

		Node<E> temp = head;
		head = head.next;
		return temp.data;
	}
	public E poll()throws Exception {
		if (ll.isEmpty()) {
			//throw  Exception("Peeking from empty");
		}
		return ll.getLast();
	}

}
