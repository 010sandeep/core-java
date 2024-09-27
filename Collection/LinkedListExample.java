package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
		l.add(12);
		l.add(1);
		l.add("sandeep");
		
		System.out.println(l);
		
		Iterator it = l.iterator();
		
	while (it.hasNext()) {
		
		System.out.println(it.next());
//		System.out.println(l);
	}
//	 System.out.println(l);
	}
  

}

