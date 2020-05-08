import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class Mapx {
	public static void main(String args[]) {
		Map<String,Integer> map=new HashMap<>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three",3);
		map.put("Four", 4);
		map.put("Five", 5);
		System.out.println(map);
		map.put("One",10);
		System.out.println(map);
		
		map.putIfAbsent("Three", 30);
		System.out.println(map);
		System.out.println(map.get("Two"));
		System.out.println(map.get("Ten"));
		System.out.println(map.containsKey("One"));
		System.out.println(map.containsKey("Ten"));
		System.out.println(map.containsValue(2));
		
		map.remove("Five");
		
		map.remove("One",10);
		map.remove("Four",5);
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
		Set<Entry<String,Integer>> entries=map.entrySet();
		for(Entry<String,Integer> entry:entries) {
			entry.setValue(entry.getValue()*100);
			
		}
		System.out.println(map);
		
		
	}

}
