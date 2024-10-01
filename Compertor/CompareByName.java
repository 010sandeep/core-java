package Collection.Compertor;

import java.util.Comparator;

public class CompareByName implements Comparator<Marksheet>{

	@Override
	public int compare(Marksheet a1, Marksheet a2) {
	
		return a1.name.compareTo(a2.name);
	}

}
