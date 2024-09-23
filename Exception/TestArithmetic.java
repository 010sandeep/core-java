package Exception;

public class TestArithmetic {
	
public static void main(String[] args) {
		
		int i=10;
		int a=0;
		
		try {
			int c=i/a;
			
			System.out.println(c);
		
		} catch (ArithmeticException e) {
		
			System.err.println("your no.is not divisible by zero");
		
			System.out.println(e.getMessage());
		    
			e.printStackTrace();
		}
	
}
}
