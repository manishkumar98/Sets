import java.util.*;
public class MainLinkedList1 {
	public static void main(String args[]) {
		MyLinkedList1<String> obj = new MyLinkedList1();
		for (int i = 0; i < 10; i++) {
			obj.add(i + "added");
		}
		obj.print();
	}
}
