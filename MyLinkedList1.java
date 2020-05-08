import java.util.*;
public class MyLinkedList1<E> {

	Node<E> head;
	public static class Node<E> {
		E data;
		Node<E> next;

		public Node(E data) {
			this.data = data;
			this.next = null;
		}
	}


	public void add(E data) {
		Node<E> toadd = new Node<E>(data);

		if (isEmpty()) {
			head = toadd;
			return;
		}

		Node<E> temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = toadd;
	}
	public boolean isEmpty() {
		return head == null;
	}
	public E removeLast()throws Exception {
		Node<E> temp = head;
		if (temp == null) {
			throw new Exception("Stack is empty");
		}
		if (temp.next == null) {
			Node<E> toremove = head;
			head = null;
			return toremove.data;
		}
		while (temp.next.next != null) {
			temp = temp.next;
		}
		Node<E> toremove = temp.next;
		temp.next = null;
		return toremove.data;
	}
	public void print() {
		Node<E> temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public E getLast()throws Exception {
		Node<E> temp = head;
		if (temp == null) {
			throw new Exception("Stack is empty");
		}
		if (temp.next == null) {
			Node<E> toremove = head;

			return toremove.data;
		}
		while (temp.next.next != null) {
			temp = temp.next;
		}
		Node<E> toremove = temp.next;

		return toremove.data;
	}





}
