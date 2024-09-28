package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastExample {

	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add(122);
		l.add(33);
		l.add("sandeep");
		l.add(1111);
		
		System.out.println(l);
		
		Iterator it = l.iterator();
		
		
//		l.add(12); is failfast and failfast is iteretor
		while (it.hasNext()) {
			
			System.out.println(it .next());
		}
		
	}
}
