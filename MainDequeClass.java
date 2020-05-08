import java.io.*;


public class MainDequeClass {
	public static void main(String args[])throws Exception {
		MyDeque<Integer> dq = new MyDeque();
		MyLinkedList1<Integer> ml = new  MyLinkedList1();
		dq.addtoHead(12);
		dq.addtoHead(13);
		dq.addtoHead(14);
		System.out.println("Peeked" + dq.removeLast());
		dq.removeLast();
		ml.print();
	}
}
