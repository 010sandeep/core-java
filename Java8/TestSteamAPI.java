package Java8;

import java.util.ArrayList;
import java.util.List;

public class TestSteamAPI {
	
	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<String>();
		
		list.add("Three");
		list.add("two");
		list.add("four");
		list.add("one");
		list.add("five");
		
		System.out.println("simple list" + list);
	    System.out.println("---------------");
	   
	    System.out.println("list in sorted order = ");
	   list.stream().sorted().forEach(System.out::println);
	 
	   System.out.println("---------------------");
	   System.out.println("Remove Duplicate From List");
	   list.stream().sorted().distinct().forEach(System.out::println);
	   
	   System.out.println("--------------------");
	   System.out.println("List starts with T");
	   list.stream().filter(e -> e.startsWith("T")).forEach(System.out::println);
	   
	   System.out.println("-------------------");
	   System.out.println("List in uppercase");
	   list.stream().map(e -> e.toUpperCase()).forEach(System.out::println);
	   
	   System.out.println("----------------------");
	   System.out.println("list in lowwer case");
	   list.stream().map(e -> e.toLowerCase()).forEach(System.out::println);
	   
	   System.out.println("---------------");
	   System.out.println("");
	   
	}

}
