package co.in.OOPS;

import java.time.LocalDate;
import java.time.Period;


public class ConstructorPerson {

	private String name;
	private int salary;
	private String city;
	private LocalDate dob;

	public ConstructorPerson() {

		System.out.println("i am default constructor");
	}

	public ConstructorPerson(String name, int salary, String city,LocalDate dob) {

		this.city = city;
		this.name = name;
		this.salary = salary;
		this.dob = dob;
	}

	public LocalDate getdob() {
		return dob;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public String getCity() {
		return city;
	}

	public int getage() {
		LocalDate CurrentDate = LocalDate.now();
		return Period.between(dob, CurrentDate).getYears();
	}

	public static void main(String[] args ) {

		
		
		ConstructorPerson p = new ConstructorPerson("sandeep", 888, "indore",LocalDate.of(2004, 10, 10));
       
		LocalDate dob=LocalDate.of(2004, 10, 10); 

		System.out.println("dob=" + p.getdob());
		System.out.println("city=" + p.getCity());
		System.out.println("name=" + p.getName());
		System.out.println("salary=" + p.getSalary());
       System.out.println("age="+ p.getage());
	}
}
