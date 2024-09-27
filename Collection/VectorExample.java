package Collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
	
	public static void main(String[] args) {
		
		
		Vector v = new Vector();
		
		v.addElement(333);
		v.addElement(19);
		v.addElement(23);
		v.addElement("asd");
		
		System.out.println(v);
		
		Iterator it = v.iterator();
	
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
