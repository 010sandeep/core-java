package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInterfaceCollection {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add("KGF");
		list.add(22);
		list.add(5.6);
		list.add("KGF");
		list.add(null);
		list.add(null);

		System.out.println(list);

		System.out.println(list.get(3));

		list.remove(3);

		System.out.println(list);

		list.set(2, "KALKI");

		System.out.println(list);
		
	System.out.println(list.subList(1, 3));
	
	System.out.println(list.indexOf(22));
	
	System.out.println(list.lastIndexOf("KGF"));
	
//	Iterator it = list.iterator();
	
//	while(it.hasNext()) {
//		System.out.println(it.next());
//	}	
		
	
	
	}

}
