package Exception;

public class TestStringIndexOutOfBoundsException {

	public static void main(String[] args) {
		
		String name= "sandeep";
		
		try {
			System.out.println(name.charAt(9));
			
			
		} catch (StringIndexOutOfBoundsException e) {
			System.err.println("String ka size chota hai");
				
			}
		
		
		
	}

}
