
import java.util.PriorityQueue;
public class priorityqexample {
	public static void main(String args[]) {
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

	}
}