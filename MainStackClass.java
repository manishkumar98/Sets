
import java.io.*;


public class MainStackClass {
	public static void main(String args[])throws Exception {
		MyStack<Integer> stack = new MyStack();
		MyLinkedList1<Integer> ml = new  MyLinkedList1();
		stack.push(12);
		stack.push(13);
		stack.push(14);
		System.out.println("Peeked" + stack.peek());
		stack.pop();
		ml.print();
	}
}
