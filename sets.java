import java.util.*;
public class sets {
	public static void main(String args[]) {
		Set<String> fruits = new HashSet<>();
		fruits.add("apple");
		fruits.add("banana");
		System.out.println(fruits.add("kiwi"));
		System.out.println(fruits.add("apple"));
		System.out.println(fruits);
		Set<String> fruits1 = new LinkedHashSet<>();
		fruits1.add("apple");
		fruits1.add("banana");
		System.out.println(fruits1.add("kiwi"));
		System.out.println(fruits1.add("apple"));
		System.out.println(fruits1);
		Set<String> fruits2 = new TreeSet<>();
		fruits2.add("apple");
		fruits2.add("banana");
		System.out.println(fruits2.add("kiwi"));
		System.out.println(fruits2.add("apple"));
		System.out.println(fruits2);

		Set<Integer>
	}

}
