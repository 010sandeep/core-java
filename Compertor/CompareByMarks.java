package Collection.Compertor;

import java.util.Comparator;

public class CompareByMarks implements Comparator<Marksheet>{

	@Override
	public int compare(Marksheet a1, Marksheet a2) {
		
		return a1.marks - a2.marks;
	}

}
