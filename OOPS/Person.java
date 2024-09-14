package co.in.OOPS;

import java.time.LocalDate;
import java.time.Period;
public class Person {
	
	private String name;
	
	private String address;

	private int salary;
	
	private LocalDate dob;
	
	
	private String city;
	
	public String getName() {
		return name;
	
	}
	public String getAddress() {
		return address;
		
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob=dob;
	}
	
	
	public void setAddress(String address) {
		this.address=address;
	}
	public int getsalary() {
		return salary;
	}
	public void setsalary(int salary) {
		this.salary=salary;
	}
     public String getcity() {
    	 return city;
     } 
     public void setcity(String city) {
    	 this.city=city;
     }
     public void setname(String name) {
    	 this.name=name;
    	 
     }
     public int getage() {
    	 LocalDate CurrentDate=LocalDate.now();
    	 return Period.between(dob,CurrentDate).getYears();
   }


}
