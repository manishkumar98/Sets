
public class MyLinkedList {
	
	Node head;
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	

	void add(int data) {
		Node toadd=new Node(data);
		
		if(head==null) {
			head=toadd;
			return;
		}
		
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=toadd;
	}
	void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	
	
	

}
