package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main(String[] args) {
		
		TreeSet t = new TreeSet();
		
		t.add(12);
		t.add(1);
		t.add(32);
		
		
		System.out.println(t);
		
		Iterator it = t.iterator();
		
		while (it.hasNext()) {
			
			System.out.println(it.next());
		}
	}

}
