
import java.io.*;


public class MyStack<E> {
	public  MyLinkedList1<E> ll = new MyLinkedList1();

	public void push(E e) {
		ll.add(e);
	}
	public E pop()throws Exception {
		if (ll.isEmpty()) {
			//throw  Exception("Popping from empty");
		}
		return ll.removeLast();
	}
	public E peek()throws Exception {
		if (ll.isEmpty()) {
			//throw  Exception("Peeking from empty");
		}
		return ll.getLast();
	}

}
