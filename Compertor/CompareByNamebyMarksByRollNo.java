package Collection.Compertor;

import java.util.Comparator;

public class CompareByNamebyMarksByRollNo implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet m1, Marksheet m2) {
		
	if (m1.name == m2.name) {
		return m1.marks - m2.marks;
		
	}else if (m1.marks == m2.marks) {
		 return m1.name.compareToIgnoreCase(m2.name);
	
	}else {
		return m1.RollNo.compareTo(m2.RollNo);
	}
		
		
	}
	
	

}
