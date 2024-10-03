package Java8;

// annoymous
public class TestFunctionInt {
	
	public static void main(String[] args) {
		
		FunctionInterface f = new FunctionInterface() {
			
			@Override
			public int sum(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
		}; 
		 
		int a = 30;
		int b = 40;
		System.out.println(f.sum(a, b));
		
		f.m2();
		
		FunctionInterface.m1();
	}

}
