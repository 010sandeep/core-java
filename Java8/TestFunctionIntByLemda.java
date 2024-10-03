package Java8;

//lemda
public class TestFunctionIntByLemda {
	
	public static void main(String[] args) {
		
		FunctionInterface f= (a,b) -> {
			
			return a+b;
		};
		
		int a = 10;
		int b = 20;
		
		System.out.println(f.sum(a, b));
	} 
}
