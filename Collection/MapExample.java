package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	
	public static void main(String[] args) {
		
		Map m = new HashMap();
		
		m.put("five", 5);
		m.put(1, "one");
		m.put(2, "two");
		m.put(3, "three");
		m.put("four", 4);
		
		System.out.println(m);
		
		System.out.println(m.get(3));
		
		System.out.println(m.containsKey(7));
		
		System.out.println(m.containsValue(4));
		
		System.out.println(m.keySet());
		
		System.out.println(m.remove(2));
		
		System.out.println(m.remove(1, "one"));
		
		System.out.println(m.entrySet());
	}

}
