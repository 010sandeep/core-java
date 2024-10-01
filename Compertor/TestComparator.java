package Collection.Compertor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparator {
	
	public static void main(String[] args) {
		
		List<Marksheet>list = new ArrayList<Marksheet>();
		
		list.add(new Marksheet("101","Sandeep",87));
		list.add(new Marksheet("104","goutam",67));
		list.add(new Marksheet("105","Sandeep",82));
		list.add(new Marksheet("102","gourabh",37));
		list.add(new Marksheet("106","Sandeep",97));
		list.add(new Marksheet("103","vikas",77));

//		CompareByName c= new CompareByName();
//		
//		System.out.println("compare by name =");
//		Collections.sort(list, c);
//	
//		list.forEach(System.out::println);
//		
//		CompareByMarks mark = new CompareByMarks();
//		System.out.println("compare by marks =");
//		
//		Collections.sort(list, mark);
//		
//		list.forEach(System.out::println);
//		
		
		CompareByNamebyMarksByRollNo All = new CompareByNamebyMarksByRollNo();
		Collections.sort(list, All);
	  list.forEach(System.out::println);
	}
	

}
