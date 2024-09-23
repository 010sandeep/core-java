package Abstract;

public class Child extends Parent{

	@Override
	public void loan() {
		System.out.println("Complete loan");
		
	}
	
	public static void main(String[] args) {
		
		Child c = new Child();
		
		c.loan();
		
	}
	

}
