package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class TestContestents {

	public static void main(String[] args) {

		ArrayList<Contestents> list = new ArrayList<Contestents>();

		list.add(new Contestents("ram", "9009031011"));
		list.add(new Contestents("rajaram", "9009031011"));
		list.add(new Contestents("Sandeep", "8815606689"));
		list.add(new Contestents("goutam", "9999031011"));
		list.add(new Contestents("mohit", "9229031011"));
		list.add(new Contestents("vikas", "9209031011"));
		list.add(new Contestents("Invalid no.", "91"));

		System.out.println("Get phone number = ");
		list.stream().map(e -> e.phone).forEach(System.out::println);

		System.out.println("---------------------");
		System.out.println("get valid phone no. = ");
		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).forEach(System.out::println);

		System.out.println("---------------------------------");
		System.out.println("Remove duplicate phone number");
		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct().forEach(System.out::println);

		System.out.println("---------------------------------------");
		System.out.println("shuffle phone number ");
		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();

				})).forEach(System.out::println);
		

		System.out.println("--------------------------");
		System.out.println("get three winners ");
		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(3).forEach(System.out::println);

		System.out.println("--------------------------------");
		System.out.println("Display winners ");
		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();

				})).limit(3).forEach(e -> System.out.println(e));

	}

}
