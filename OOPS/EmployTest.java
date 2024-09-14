package co.in.OOPS;

public class EmployTest {
	
	private String name;
	
	private int salary;

	private double id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}
	
	public static void main(String[] args) {
		
		EmployTest e=new EmployTest();
		
		e.setName("sandeep");
		e.setId(12.23);
		e.setSalary(1234);
		
		System.out.println("Employ name="+e.getName());
		System.out.println("Employ id="+e.getId());
		System.out.println("employ salary="+e.getSalary());
	}
	
	
	
}
