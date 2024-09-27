package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//shorted order
// no duplicate number
//null only once used

public class SetInterfaceCollection {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		set.add(4);
		set.add(2);
		set.add(5.7);
		set.add(3);
		
		System.out.println(set);
	
	  Iterator it = set.iterator();
	  
	  while(it.hasNext()) {
		  
		  System.out.println(it.next());
		  
	  }
	System.out.println(set.isEmpty());
	
	System.out.println(set.size());
	
	}
	
}
