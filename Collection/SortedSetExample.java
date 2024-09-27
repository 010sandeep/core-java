package Collection;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {

		SortedSet s = new TreeSet();

		s.add(12);
		s.add(13);//
		s.add(1);

		System.out.println(s.first());
		System.out.println(s.last());

		System.out.println(s);

		Iterator it = s.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
