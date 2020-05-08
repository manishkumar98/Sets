import java.util.*;
public class Manish {
	public static void main(String args[]) {
		//Stack Operation
		ArrayDeque<Integer> ad=new ArrayDeque<>();
		ad.addFirst(12);
		ad.addFirst(22);
		ad.addFirst(32);
		ad.addFirst(42);
		ad.offerFirst(52);
		System.out.println(ad);
		//System.out.println(ad.pop());
		System.out.println(ad.removeFirst());
		System.out.println(ad.peekFirst());
		System.out.println(ad.getFirst());
		System.out.println(ad.pollFirst());
		
		System.out.println("-------------");
		//Stack Operation
		ArrayDeque<Integer> ad1=new ArrayDeque<>();
		ad1.addLast(12);
		ad1.addLast(22);
		ad1.addLast(32);
		ad1.addLast(42);
		ad1.offerLast(52);
		System.out.println(ad1);
		//System.out.println(ad1.pop());
		System.out.println(ad1.removeLast());
		System.out.println(ad1.peekLast());
		System.out.println(ad1.getLast());
		System.out.println(ad1.pollLast());
		
		System.out.println("-------------");
		
		//Queue Operation
				ArrayDeque<Integer> ad2=new ArrayDeque<>();
				ad2.addFirst(12);
				ad2.addFirst(22);
				ad2.addFirst(32);
				ad2.addFirst(42);
				ad2.offerFirst(52);
				System.out.println(ad2);
				//System.out.println(ad2.pop());
				System.out.println(ad2.removeLast());
				System.out.println(ad2.peekLast());
				System.out.println(ad2.getLast());
				System.out.println(ad2.pollLast());
				
				System.out.println("-------------");
				//Queue Operation
				ArrayDeque<Integer> ad3=new ArrayDeque<>();
				ad3.addLast(12);
				ad3.addLast(22);
				ad3.addLast(32);
				ad3.addLast(42);
				ad3.offerLast(52);
				System.out.println(ad3);
				//System.out.println(ad3.pop());
				System.out.println(ad3.removeFirst());
				System.out.println(ad3.peekFirst());
				System.out.println(ad3.getFirst());
				System.out.println(ad3.pollFirst());
				
				System.out.println("-------------");
		
		
		
		
		
		
		
		Stack<Integer> stack=new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		int peeked=stack.peek();
		System.out.println(peeked);
		
		int popped=stack.pop();
		System.out.println(popped);
		 popped=stack.pop();
		System.out.println(popped);
		 popped=stack.pop();
		System.out.println(popped);
		
		
		System.out.println("-------------");
		
		
		Queue<Integer> q=new LinkedList<>();
		q.add(10);
		q.add(11);
		q.add(12);
		q.add(13);
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.element());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.poll());//returns null if queue is empty
		
		
		
		
		
		
		
		
		
		

		System.out.println("-------------");
		
		
		List<Integer> ll=new LinkedList<>();
		ll.add(12);
		ll.add(2);
		ll.add(32);
		System.out.println(ll);
		System.out.println(ll.get(1));
		ll.set(2, 13);
		System.out.println(ll.get(2));
		System.out.println(ll);
		System.out.println("-------------");
		
		//Array List without generics
		ArrayList al=new ArrayList();
		al.add(23);
		al.add("Apple");
		System.out.println(al);
		System.out.println("]]]]]]]]]]]]]]]]]]]]");
		
		List<String> fruit=new LinkedList();
		List<String>vegetable=new ArrayList();
		fruit.add("Orange");
		fruit.add("Apple");
		fruit.add("Grapes");
		
		String temp[]=new String[fruit.size()];
		fruit.toArray(temp);
		for(String e:temp) {
			System.out.println(e);
		}
		
		System.out.println("dddddddddddddddddddddddd");
		
		fruit.set(1,"Papaya");
		fruit.remove(1);
		System.out.println(fruit);
		vegetable.add("Potato");
		vegetable.add("Brinjal");
		vegetable.add("Carrot");
		System.out.println(fruit.contains("Orange"));
		fruit.addAll(vegetable);
		System.out.println(fruit);
		fruit.removeAll(vegetable);
		System.out.println(fruit);
		
		System.out.println(fruit.get(1));
		
		System.out.println("MMMMMMMMMMMMMMMMMMMMMM");
		
		
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("Harry");
		pq.add("Arjun");
		pq.add("Downy");
		pq.add("Junior");
		System.out.println(pq);
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());

		PriorityQueue<Integer> pq1 = new PriorityQueue<>();
		pq1.add(5);
		pq1.add(1);
		pq1.add(2);
		pq1.add(3);
		System.out.println(pq1);
		System.out.println(pq1.remove());
		System.out.println(pq1.remove());
		System.out.println(pq1.remove());
		System.out.println(pq1.remove());
		Set<String> fruits = new HashSet<>();
		fruits.add("apple");
		fruits.add("banana");
		System.out.println(fruits.add("kiwi"));
		System.out.println(fruits.add("apple"));
	
		System.out.println(fruits);
		System.out.println("------");
		Set<String> fruits1 = new LinkedHashSet<>();
		fruits1.add("banana");
		fruits1.add("apple");
		
		System.out.println(fruits1.add("kiwi"));
		System.out.println(fruits1.add("apple"));
		System.out.println(fruits1);
		System.out.println("--=++++++---");
		Set<String> fruits2 = new TreeSet<>();
		fruits2.add("banana");
		fruits2.add("apple");
		
		System.out.println(fruits2.add("kiwi"));
		System.out.println(fruits2.add("apple"));
		System.out.println(fruits2);
		Set<Integer> x=new HashSet<>();
		x.add(1);
		x.add(2);
		x.add(3);
		x.add(4);
		Set<Integer> y=new HashSet<>();
		y.add(3);
		y.add(4);
		y.add(5);
		y.add(6);
		System.out.println(x.addAll(y));
		System.out.println(x);
		Set<Integer> x1=new HashSet<>();
		x1.add(1);
		x1.add(2);
		x1.add(3);
		x1.add(4);
		Set<Integer> y1=new HashSet<>();
		y1.add(3);
		y1.add(4);
		y1.add(5);
		y1.add(6);
		System.out.println(x1.retainAll(y1));
		System.out.println(x1);
		
		
		System.out.println("-----------------");
		
		List<Integer> linkl=new LinkedList<>();
		List<Integer> arrayl=new ArrayList<>();
		getTimeDiff(arrayl);
		getTimeDiff(linkl);
		
		
	}
	static void getTimeDiff(List<Integer> list) {
		long start=System.currentTimeMillis();
		for(int i=0;i<10000;i++) {
			list.add(0,i);
			}
		long end=System.currentTimeMillis();
		System.out.println(list.getClass().getName()+"--->"+(end-start));
		
	}

}
