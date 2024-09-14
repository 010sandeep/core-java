package co.in.OOPS;

import java.time.LocalDate;

public class TestPerson {  
	
	public static void main(String[] args) {
		
		
		LocalDate dob=LocalDate.of(2003,07, 15);
		Person p=new Person();
		p.setsalary(4799999);
		p.setAddress("indore123");
		p.setname("sandeep");
		p.setcity("indore");
	    p.setDob(dob); 
		
		
		System.out.println("address="+p.getAddress());
	    System.out.println("name="+p.getName());	
	    System.out.println("city="+p.getcity());
	    System.out.println("salary="+p.getsalary());
	    System.out.println("dob="+p.getDob());
	    System.out.println("age="+p.getage());
	}
	
	

}
