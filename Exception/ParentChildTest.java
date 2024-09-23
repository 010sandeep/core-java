package Exception;

public class ParentChildTest {
	
	public static void main(String[] args) {
		
		String name  = "sandeep";
		
		try {
			System.out.println("lenght of name is = " + name.length());
			
			System.out.println("charter at 10 posistion is = " + name.charAt(9));
	
		} catch (StringIndexOutOfBoundsException e) {
			System.err.println("String abhi choti hai");
		
		}catch(RuntimeException e) {
			
			System.out.println("Error= " + e.getMessage());
		}
		
		
		
	}
	

}
