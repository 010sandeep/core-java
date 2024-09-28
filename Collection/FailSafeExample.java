package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class FailSafeExample {

	public static void main(String[] args) {
		
		Vector p = new Vector();
		
		p.addElement(12);
		p.addElement(13);
		p.addElement(14);
		p.addElement(1);
		
		
		
		System.out.println(p);
		
		Enumeration e = p.elements();
		
		p.addElement(909);
		
		while (e.hasMoreElements()) {
			
			System.out.println(e.nextElement());
		}
		
	}

}
